public void delete(boolean removeForeignKey, org.dbflute.erflute.editor.model.diagram_contents.not_element.dictionary.Dictionary dictionary) {
    super.delete();
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn foreignKeyColumn : getForeignKeyColumns()) {
        foreignKeyColumn.removeReference(this);
        if (removeForeignKey) {
            if (foreignKeyColumn.getRelationshipList().isEmpty()) {
                getTargetTableView().removeColumn(foreignKeyColumn);
            }
        }else {
            dictionary.add(foreignKeyColumn);
        }
    }
}