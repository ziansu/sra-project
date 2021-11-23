private long lookupCSElement(java.lang.String rootelement) {
    com.fatwire.cs.core.db.StatementParam param = tools.gsf.mapping.IcsMappingService.lookup_cselement.newParam();
    param.setString(0, rootelement);
    tools.gsf.facade.sql.Row row = tools.gsf.facade.sql.SqlHelper.selectSingle(ics, tools.gsf.mapping.IcsMappingService.lookup_cselement, param);
    return row == null ? -1L : row.getLong("id");
}