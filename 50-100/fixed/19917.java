public void addReference(org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn referredColumn, org.dbflute.erflute.editor.model.diagram_contents.element.connection.Relationship relationship) {
    if ((referredColumnList.contains(referredColumn)) || (relationshipList.contains(relationship))) {
        return ;
    }
    this.foreignKeyDescription = getDescription();
    this.foreignKeyLogicalName = getLogicalName();
    this.foreignKeyPhysicalName = getPhysicalName();
    referredColumnList.add(referredColumn);
    relationshipList.add(relationship);
    org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn.copyData(this, this);
    this.word = null;
}