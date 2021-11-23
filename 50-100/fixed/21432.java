public void setForeignKeyForComplexUniqueKey(org.dbflute.erflute.editor.model.diagram_contents.element.node.table.unique_key.CompoundUniqueKey compoundUniqueKey) {
    if ((referredCompoundUniqueKey) == compoundUniqueKey) {
        return ;
    }
    removeAllForeignKey();
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn sourceColumn : compoundUniqueKey.getColumnList()) {
        final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn foreignKeyColumn = new org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn(sourceColumn, sourceColumn, this, false);
        getTargetTableView().addColumn(foreignKeyColumn);
    }
    this.referenceForPK = false;
    this.referredSimpleUniqueColumn = null;
    this.referredCompoundUniqueKey = compoundUniqueKey;
}