@java.lang.Override
protected void doUndo() {
    super.doUndo();
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn foreignKey : this.referencedColumnMap.keySet()) {
        if (!(this.removeForeignKey)) {
            final org.dbflute.erflute.editor.model.diagram_contents.not_element.dictionary.Dictionary dictionary = this.oldTargetTable.getDiagram().getDiagramContents().getDictionary();
            dictionary.remove(foreignKey);
        }
        foreignKey.addReference(this.referencedColumnMap.get(foreignKey), this.relation);
    }
    this.oldTargetCopyTable.restructureData(this.oldTargetTable);
}