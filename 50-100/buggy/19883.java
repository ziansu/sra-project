public void mousePressed(bms.player.beatoraja.MainState state, int button, int x, int y) {
    for (bms.player.beatoraja.skin.SkinObject obj : objects) {
        if (isDraw(obj.getOption(), state)) {
            obj.mousePressed(state, button, x, y);
        }
    }
}