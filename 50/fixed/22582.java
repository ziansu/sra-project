@java.lang.Override
protected boolean mousePressed(bms.player.beatoraja.MainState state, int button, int x, int y) {
    return ((bms.player.beatoraja.select.MusicSelector) (state)).getBarRender().mousePressed(this, button, x, y);
}