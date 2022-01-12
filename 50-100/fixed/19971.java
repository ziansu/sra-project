public squidpony.squidgrid.gui.gdx.SquidLayers putString(int x, int y, java.lang.String s, int foregroundIndex, int backgroundIndex) {
    foregroundPanel.put(x, y, s, palette.get(foregroundIndex));
    for (int i = x; (i < (x + (s.length()))) && (i < (getTotalWidth())); i++) {
        backgroundPanel.put(i, y, palette.get(backgroundIndex));
    }
    return this;
}