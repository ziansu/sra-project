@java.lang.Override
protected void doUndo() {
    super.doUndo();
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn foreignKey : referencedColumnMap.keySet()) {
        if (!(removeForeignKey)) {
            final org.dbflute.erflute.editor.model.diagram_contents.not_element.dictionary.Dictionary dictionary = oldTargetTable.getDiagram().getDiagramContents().getDictionary();
            dictionary.remove(foreignKey);
        }
        foreignKey.addReference(referencedColumnMap.get(foreignKey), relation);
    }
    oldTargetCopyTable.restructureData(oldTargetTable);
}