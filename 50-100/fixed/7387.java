@java.lang.Override
protected org.eclipse.draw2d.geometry.Rectangle getFrameArea(org.eclipse.draw2d.geometry.Rectangle origin) {
    if (!(model.isMinimizedView())) {
        return new org.eclipse.draw2d.geometry.Rectangle(((origin.x) + (GRID_SIZE)), origin.y, ((origin.width) - (2 * (GRID_SIZE))), ((origin.height) - (GRID_SIZE)));
    }
    return super.getFrameArea(origin);
}