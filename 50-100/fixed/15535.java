public java.util.List<java.awt.Rectangle> generateGrid() {
    java.util.List<java.awt.Rectangle> list = new java.util.ArrayList<>();
    for (int x = 0; x <= (width); x += tileWidth) {
        for (int y = 0; y <= (height); y += tileHeight) {
            list.add(new java.awt.Rectangle(x, y, tileWidth, tileHeight));
        }
    }
    return list;
}