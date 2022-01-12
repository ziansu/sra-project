public void setIndexes(java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.node.table.index.ERIndex> indexes) {
    this.indexes = indexes;
    if ((this.getDiagram()) != null) {
        this.firePropertyChange(IndexSet.PROPERTY_CHANGE_INDEXES, null, null);
        this.getDiagram().getDiagramContents().getIndexSet().update();
    }
}