public void createSelection(java.awt.Rectangle bounds) {
    if (hasSelection()) {
        finishSelection();
    }
    addSelectionPoint(bounds.getLocation(), new java.awt.Point(((bounds.x) + (bounds.width)), ((bounds.y) + (bounds.height))), false);
    completeSelection(new java.awt.Point(((bounds.x) + (bounds.width)), ((bounds.y) + (bounds.height))));
    getSelectionFromCanvas();
}