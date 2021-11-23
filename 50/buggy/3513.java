protected boolean doesColumnHaveAnchor(final com.notlob.jgrid.model.Column column) {
    return column == (gridModel.getSelectionModel().getAnchorColumn());
}