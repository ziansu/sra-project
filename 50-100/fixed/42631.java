@java.lang.Override
public org.dbflute.erflute.editor.model.diagram_contents.element.node.table.ERTable clone() {
    final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.ERTable clone = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.ERTable) (super.clone()));
    final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.properties.TableProperties cloneTableProperties = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.properties.TableProperties) (getTableViewProperties().clone()));
    clone.tableViewProperties = cloneTableProperties;
    return clone;
}