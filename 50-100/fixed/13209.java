public void setForeignKeyColumnForPK() {
    if (referenceForPK) {
        return ;
    }
    removeAllForeignKey();
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn sourceColumn : ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.ERTable) (getSourceTableView())).getPrimaryKeys()) {
        final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn foreignKeyColumn = new org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn(sourceColumn, sourceColumn, this, false);
        getTargetTableView().addColumn(foreignKeyColumn);
    }
    this.referenceForPK = true;
    this.referredSimpleUniqueColumn = null;
    this.referredCompoundUniqueKey = null;
}