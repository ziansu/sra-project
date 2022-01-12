public org.dbflute.erflute.editor.model.diagram_contents.element.connection.Relationship restructureRelationData(org.dbflute.erflute.editor.model.diagram_contents.element.connection.Relationship to) {
    to.setForeignKeyName(getForeignKeyName());
    to.setOnDeleteAction(getOnDeleteAction());
    to.setOnUpdateAction(getOnUpdateAction());
    to.setChildCardinality(getChildCardinality());
    to.setParentCardinality(getParentCardinality());
    return to;
}