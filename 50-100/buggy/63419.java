@java.lang.Override
protected void generateSqlMapContentSelective(org.mybatis.generator.api.IntrospectedTable introspectedTable, org.mybatis.generator.api.dom.xml.XmlElement parent) {
    generateTextBlockAppendTableName("insert into ", introspectedTable, parent);
    generateActualColumnNamesWithParenthesis(com.freetmp.mbg.plugin.upsert.PROPERTY_PREFIX, true, introspectedTable.getAllColumns(), parent);
    generateTextBlock("values ", parent);
    generateParametersSeparateByCommaWithParenthesis(com.freetmp.mbg.plugin.upsert.PROPERTY_PREFIX, true, introspectedTable.getAllColumns(), parent);
    generateTextBlock("on duplicate key update ", parent);
    generateParameterForSet(com.freetmp.mbg.plugin.upsert.PROPERTY_PREFIX, true, introspectedTable, parent);
}