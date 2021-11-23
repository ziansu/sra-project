public void setForeignKeyColumnForPK() {
    if (this.referenceForPK) {
        return ;
    }
    this.removeAllForeignKey();
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn sourceColumn : ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.ERTable) (this.getSourceTableView())).getPrimaryKeys()) {
        final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn foreignKeyColumn = new org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn(sourceColumn, sourceColumn, this, false);
        this.getTargetTableView().addColumn(foreignKeyColumn);
    }
    this.referenceForPK = true;
    this.referredSimpleUniqueColumn = null;
    this.referredCompoundUniqueKey = null;
}