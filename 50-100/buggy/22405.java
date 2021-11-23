public java.lang.String displayMetabolitesColumnNameFromIndex(int columnIndex, java.util.ArrayList<java.lang.String> metaColumnNames) {
    java.lang.String columnName = "";
    if (columnIndex > (GraphicalInterfaceConstants.METABOLITES_COLUMN_NAMES.length)) {
        columnName = metaColumnNames.get((columnIndex - ((GraphicalInterfaceConstants.METABOLITES_COLUMN_NAMES.length) + 1)));
    }else {
        columnName = edu.rutgers.MOST.presentation.GraphicalInterfaceConstants.METABOLITES_COLUMN_NAMES[columnIndex];
    }
    return columnName;
}