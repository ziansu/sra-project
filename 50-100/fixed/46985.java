public void tileClicked(view.Point point) {
    if ((((point.x) >= 175) && ((point.x) <= 221)) && ((point.y) <= 46)) {
        changePaintColor();
    }else
        if (((camera.getTileLocation(point).x) < (view.gui.screen.MapMakerPanel.BOARD_SIZE)) && ((camera.getTileLocation(point).y) < (view.gui.screen.MapMakerPanel.BOARD_SIZE))) {
            iterateTile(camera.getTileLocation(point));
        }
    
}