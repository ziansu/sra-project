public void increaseHeight() {
    _rowHeight += 5;
    if ((_rowHeight) > ((taskblocks.graph.TaskGraphComponent.DEFAULT_ROW_HEIGHT) + 30)) {
        _rowHeight = (taskblocks.graph.TaskGraphComponent.DEFAULT_ROW_HEIGHT) + 30;
    }
    _fontSize = ((int) ((0.6 * (_rowHeight)) - 4.0));
    _builder.setPaintDirty();
    repaint();
}