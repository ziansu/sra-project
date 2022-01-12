public void addReference(org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn referredColumn, org.dbflute.erflute.editor.model.diagram_contents.element.connection.Relationship relationship) {
    this.foreignKeyDescription = getDescription();
    this.foreignKeyLogicalName = getLogicalName();
    this.foreignKeyPhysicalName = getPhysicalName();
    this.referredColumnList.add(referredColumn);
    this.relationshipList.add(relationship);
    org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn.copyData(this, this);
    this.word = null;
}