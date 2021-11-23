public boolean mouseOver(int mouseX, int mouseY) {
    boolean over = false;
    for (java.util.Iterator<tiles.Tile> iterator = tiles.iterator(); iterator.hasNext();) {
        tiles.Tile next = iterator.next();
        if (next.mouseOver(mouseX, mouseY)) {
            selected = true;
        }
    }
    return over;
}