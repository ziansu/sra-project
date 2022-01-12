public void setForeignKeyColumn(org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn sourceColumn) {
    if ((referredSimpleUniqueColumn) == sourceColumn) {
        return ;
    }
    removeAllForeignKey();
    final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn foreignKeyColumn = new org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn(sourceColumn, sourceColumn, this, false);
    getTargetTableView().addColumn(foreignKeyColumn);
    this.referenceForPK = false;
    this.referredSimpleUniqueColumn = sourceColumn;
    this.referredCompoundUniqueKey = null;
}