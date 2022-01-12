public org.adempiere.ad.expression.api.IStringExpression getSqlOrderByEffective() {
    final java.util.List<de.metas.ui.web.window.model.DocumentQueryOrderBy> orderBys = getOrderBysEffective();
    return de.metas.ui.web.window.model.sql.SqlDocumentOrderByBuilder.newInstance(entityBinding::getFieldOrderBy).buildSqlOrderBy(orderBys);
}