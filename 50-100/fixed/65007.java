protected void updateExtractedSchemaAndAlias(final edu.ub.tbd.parser.SchemaGen.SchemaParser parser) {
    java.util.HashMap<java.lang.String, edu.ub.tbd.beans.TableBean> _extractedSchema = parser.extractSchema();
    CONSTRAINTS.addAll(parser.getConstraints());
    addAllExtractedAlias(parser.getExtractedAlias());
    for (edu.ub.tbd.beans.TableBean tbl : _extractedSchema.values()) {
        updateExtractedSchema(tbl);
    }
}