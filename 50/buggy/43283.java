public void reveal(final com.notlob.jgrid.model.Column column, final T element) {
    com.notlob.jgrid.Grid.checkWidget();
    viewport.reveal(gc, column, gridModel.getRow(element));
    viewport.invalidate();
    com.notlob.jgrid.Grid.redraw();
}