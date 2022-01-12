public boolean isReferable() {
    if ((this.getPrimaryKeySize()) > 0) {
        return true;
    }
    if ((this.compoundUniqueKeyList.size()) > 0) {
        return true;
    }
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.ERColumn column : this.columns) {
        if (column instanceof org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn) {
            final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn normalColumn = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn) (column));
            if (normalColumn.isUniqueKey()) {
                return true;
            }
        }
    }
    return false;
}