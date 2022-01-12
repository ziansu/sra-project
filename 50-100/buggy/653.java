public java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn> getPrimaryKeys() {
    final java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn> primaryKeys = new java.util.ArrayList<>();
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.ERColumn column : this.columns) {
        if (column instanceof org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn) {
            final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn normalColumn = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn) (column));
            if (normalColumn.isPrimaryKey()) {
                primaryKeys.add(normalColumn);
            }
        }
    }
    return primaryKeys;
}