public org.dbflute.erflute.editor.model.diagram_contents.element.connection.Relationship restructureRelationData(org.dbflute.erflute.editor.model.diagram_contents.element.connection.Relationship to) {
    to.setForeignKeyName(this.getForeignKeyName());
    to.setOnDeleteAction(this.getOnDeleteAction());
    to.setOnUpdateAction(this.getOnUpdateAction());
    to.setChildCardinality(this.getChildCardinality());
    to.setParentCardinality(this.getParentCardinality());
    return to;
}