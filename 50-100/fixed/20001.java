public io.konig.shacl.Shape toShape(io.konig.sql.SQLTableSchema tableSchema) {
    if ((datatypeMapper) == null) {
        datatypeMapper = new io.konig.sql.XsdSQLDatatypeMapper();
    }
    org.openrdf.model.URI tableId = tableNamer.tableId(tableSchema);
    io.konig.shacl.Shape shape = new io.konig.shacl.Shape(tableId);
    for (io.konig.sql.SQLColumnSchema column : tableSchema.listColumns()) {
        addProperty(shape, column);
    }
    return shape;
}