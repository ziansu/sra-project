public void setBounds(xyz.upperlevel.ulge.gui.Bounds bounds) {
    uBounds.set(bounds.minX, bounds.minY, ((bounds.maxX) - (bounds.minX)), ((bounds.maxY) - (bounds.minY)));
}