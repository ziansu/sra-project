public void checkBtnState(controlP5.ControllerInterface ctrl1, controlP5.ControllerInterface ctrl2) {
    if ((currentPage) == 0) {
        ctrl1.hide();
    }else {
        ctrl1.show();
    }
    if ((currentPage) == (maxPages)) {
        ctrl2.hide();
    }else {
        ctrl2.show();
    }
}