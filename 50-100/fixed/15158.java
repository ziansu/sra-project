public void createSelection(java.awt.Rectangle bounds) {
    if (hasSelection()) {
        finishSelection();
    }
    addSelectionPoint(bounds.getLocation(), new java.awt.Point(((bounds.x) + (bounds.width)), ((bounds.y) + (bounds.height))), false);
    getSelectionFromCanvas();
    completeSelection(new java.awt.Point(((bounds.x) + (bounds.width)), ((bounds.y) + (bounds.height))));
}