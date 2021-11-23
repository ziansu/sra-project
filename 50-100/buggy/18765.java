public squidpony.squidgrid.gui.gdx.SquidLayers putString(int x, int y, java.lang.String s, com.badlogic.gdx.graphics.Color foreground, com.badlogic.gdx.graphics.Color background) {
    foregroundPanel.put(x, y, s, foreground);
    for (int i = x; (i < (s.length())) && (i < (getTotalWidth())); i++) {
        backgroundPanel.put(i, y, background);
    }
    return this;
}