public int getPrimaryKeySize() {
    int count = 0;
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.ERColumn column : columns) {
        if (column instanceof org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn) {
            final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn normalColumn = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn) (column));
            if (normalColumn.isPrimaryKey()) {
                count++;
            }
        }
    }
    return count;
}