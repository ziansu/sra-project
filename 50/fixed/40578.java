private java.awt.Point snapToGridView(java.awt.Point mousePosition) {
    java.awt.Point modelPosition = viewport.transformInverse(mousePosition);
    java.awt.Point snappedModelPosition = uniol.aptgui.editor.features.ToolUtil.snapToGrid(modelPosition, editingOptions.getGridSpacing());
    return snappedModelPosition;
}