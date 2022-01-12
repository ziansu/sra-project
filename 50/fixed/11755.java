@java.lang.Override
protected void result(java.lang.Object object) {
    this.hide();
    popupScreenIsShown = false;
    gameController.abortLevel();
}