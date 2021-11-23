public void setTargetTableWithExistingColumns(org.dbflute.erflute.editor.model.diagram_contents.element.node.table.ERTable target, java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn> referencedColumnList, java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn> foreignKeyColumnList) {
    super.setTargetWalker(target);
    this.firePropertyChange("target", null, target);
}