public void add(final org.concord.energy3d.model.HousePart housePart, final boolean redraw) {
    final org.concord.energy3d.model.HousePart container = housePart.getContainer();
    if (container != null)
        container.getChildren().add(housePart);
    
    add(housePart);
    if (redraw)
        redrawAll();
    
}