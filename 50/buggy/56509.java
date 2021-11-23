public int remove(org.dbflute.erflute.editor.model.diagram_contents.element.node.table.ERTable table) {
    final int index = tableList.indexOf(table);
    if (0 < index) {
        tableList.remove(index);
    }
    firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.node.table.TableSet.PROPERTY_CHANGE_TABLE_SET, null, null);
    return index;
}