public graphics.IGraphics getGraphics() {
    graphics.GraphicsCollection mapGraphics = new graphics.GraphicsCollection();
    mapGraphics.add(map.getGraphics());
    return mapGraphics;
}