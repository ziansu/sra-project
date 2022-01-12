@java.lang.Override
protected void generateSqlMapContent(org.mybatis.generator.api.IntrospectedTable introspectedTable, org.mybatis.generator.api.dom.xml.XmlElement parent) {
    generateTextBlockAppendTableName("insert into ", introspectedTable, parent);
    generateActualColumnNamesWithParenthesis(introspectedTable.getAllColumns(), parent);
    generateTextBlock("values ", parent);
    generateParametersSeparateByCommaWithParenthesis(com.freetmp.mbg.plugin.upsert.PROPERTY_PREFIX, introspectedTable.getAllColumns(), parent);
    generateTextBlock("on duplicate key update ", parent);
    generateParameterForSet(com.freetmp.mbg.plugin.upsert.PROPERTY_PREFIX, introspectedTable, parent);
}