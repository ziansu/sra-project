@org.eclipse.acceleo.annotations.api.documentation.Documentation(value = "Tells if the Column is in the primary key.", params = { @org.eclipse.acceleo.annotations.api.documentation.Param(name = "column", value = "The Column") }, result = "true if the Column is in the primary key, false otherwise", examples = { @org.eclipse.acceleo.annotations.api.documentation.Example(expression = "column.isInPrimaryKey()", result = "true") })
public java.lang.String isInPrimaryKey(org.obeonetwork.dsl.database.Column column) {
    if (column != null) {
        return yesNo(column.isInPrimaryKey());
    }else {
        return "No";
    }
}