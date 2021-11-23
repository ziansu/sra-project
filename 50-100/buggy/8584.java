public java.util.List<java.lang.String> getClusterAttributeList(org.cytoscape.model.CyNetwork network) {
    java.util.Collection<org.cytoscape.model.CyColumn> columns = network.getDefaultNodeTable().getColumns();
    java.util.List<java.lang.String> intList = new java.util.ArrayList<java.lang.String>();
    for (org.cytoscape.model.CyColumn column : columns) {
        if (column.getType().equals(java.lang.Integer.class)) {
            intList.add(column.getName());
        }
    }
    return intList;
}