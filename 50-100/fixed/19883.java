public void mousePressed(bms.player.beatoraja.MainState state, int button, int x, int y) {
    for (int i = (objects.size()) - 1; i >= 0; i--) {
        final bms.player.beatoraja.skin.SkinObject obj = objects.get(i);
        if ((isDraw(obj.getOption(), state)) && (obj.mousePressed(state, button, x, y))) {
            break;
        }
    }
}