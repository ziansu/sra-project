private static org.pentaho.agilebi.modeler.LogicalColumn findCorrespondingOlapColumn(org.pentaho.agilebi.modeler.LogicalColumn relationalColumn, org.pentaho.agilebi.modeler.LogicalModel olapModel) {
    org.pentaho.agilebi.modeler.LogicalTable olapTable = org.pentaho.agilebi.modeler.ModelerConversionUtil.findCorrespondingOlapTable(relationalColumn.getLogicalTable(), olapModel);
    if (olapTable != null) {
        for (org.pentaho.agilebi.modeler.LogicalColumn col : olapTable.getLogicalColumns()) {
            if (col.getPhysicalColumn().getId().equals(relationalColumn.getPhysicalColumn().getId())) {
                return col;
            }
        }
    }
    return null;
}