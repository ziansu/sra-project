protected static org.pentaho.agilebi.modeler.LogicalTable findCorrespondingOlapTable(org.pentaho.agilebi.modeler.LogicalTable relationalTable, org.pentaho.agilebi.modeler.LogicalModel olapModel) {
    for (org.pentaho.agilebi.modeler.LogicalTable table : olapModel.getLogicalTables()) {
        if (table.getPhysicalTable().getId().equals(relationalTable.getPhysicalTable().getId())) {
            return table;
        }
    }
    return null;
}