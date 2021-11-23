@java.lang.Override
protected org.eclipse.draw2d.geometry.Rectangle getFrameArea(org.eclipse.draw2d.geometry.Rectangle origin) {
    if (!(model.isMinimizedView())) {
        return new org.eclipse.draw2d.geometry.Rectangle(((origin.x) + ((GRID_SIZE) / 2)), origin.y, ((origin.width) - (GRID_SIZE)), origin.height);
    }
    return super.getFrameArea(origin);
}