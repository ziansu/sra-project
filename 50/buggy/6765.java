@java.lang.Override
public org.dbflute.erflute.editor.model.diagram_contents.element.node.table.properties.TableViewProperties getTableViewProperties() {
    this.tableViewProperties = org.dbflute.erflute.db.DBManagerFactory.getDBManager(this.getDiagram()).createTableProperties(((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.properties.TableProperties) (this.tableViewProperties)));
    return this.tableViewProperties;
}