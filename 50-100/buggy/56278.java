public org.nextprot.commons.statements.RawStatement mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    org.nextprot.commons.statements.StatementBuilder sfbuilder = org.nextprot.commons.statements.StatementBuilder.createNew();
    for (org.nextprot.commons.statements.StatementField field : org.nextprot.commons.statements.StatementField.values()) {
        sfbuilder.addStatementField(field, rs.getString(field.name()));
    }
    return sfbuilder.build();
}