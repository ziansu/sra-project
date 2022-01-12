public java.lang.String displayMetabolitesColumnNameFromIndex(int columnIndex, java.util.ArrayList<java.lang.String> metaColumnNames) {
    java.lang.String columnName = "";
    if (columnIndex < (GraphicalInterfaceConstants.METABOLITES_COLUMN_NAMES.length)) {
        columnName = edu.rutgers.MOST.presentation.GraphicalInterfaceConstants.METABOLITES_COLUMN_NAMES[columnIndex];
    }else {
        try {
            columnName = metaColumnNames.get((columnIndex - (GraphicalInterfaceConstants.METABOLITES_COLUMN_NAMES.length)));
        } catch (java.lang.Throwable t) {
            columnName = metaColumnNames.get((columnIndex - ((GraphicalInterfaceConstants.METABOLITES_COLUMN_NAMES.length) + 1)));
        }
    }
    return columnName;
}