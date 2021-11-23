public org.nextprot.commons.statements.RawStatement mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    org.nextprot.commons.statements.StatementBuilder sfbuilder = org.nextprot.commons.statements.StatementBuilder.createNew();
    for (org.nextprot.commons.statements.StatementField key : org.nextprot.commons.statements.StatementField.values()) {
        java.lang.String value = rs.getString(key.name());
        sfbuilder.addStatementField(key, value);
    }
    return sfbuilder.build();
}