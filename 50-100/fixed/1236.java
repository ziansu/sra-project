public void setIndexes(java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.node.table.index.ERIndex> indexes) {
    this.indexes = indexes;
    if ((getDiagram()) != null) {
        firePropertyChange(IndexSet.PROPERTY_CHANGE_INDEXES, null, null);
        getDiagram().getDiagramContents().getIndexSet().update();
    }
}