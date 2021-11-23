@java.lang.Override
public java.lang.Double call(java.lang.String s) throws java.lang.Exception {
    int columnIndex;
    try {
        columnIndex = java.lang.Integer.parseInt(group.getColumnIndex());
    } catch (java.lang.Exception e) {
        com.funcs.SumOperator.logger.severe(java.lang.String.format("Failed to parse column index %d.", group.getColumnIndex()));
        return java.lang.Double.valueOf(0);
    }
    return java.lang.Double.parseDouble(s.split("\\|")[columnIndex]);
}