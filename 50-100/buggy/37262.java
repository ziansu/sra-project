private kr.co.bitnine.octopus.meta.jdo.MColumn addColumn(org.apache.metamodel.schema.Column rawColumn, kr.co.bitnine.octopus.meta.jdo.MTable table) {
    java.lang.String columnName = rawColumn.getName();
    int jdbcType = rawColumn.getType().getJdbcType();
    kr.co.bitnine.octopus.meta.jdo.JDOMetaContext.LOG.debug(((("add column. columnName=" + columnName) + ", jdbcType=") + jdbcType));
    kr.co.bitnine.octopus.meta.jdo.MColumn column = new kr.co.bitnine.octopus.meta.jdo.MColumn(columnName, jdbcType, table);
    return column;
}