public java.util.List<de.metas.ui.web.window.model.DocumentQueryOrderBy> getOrderBysEffective() {
    if (noSorting) {
        return com.google.common.collect.ImmutableList.of();
    }
    final java.util.List<de.metas.ui.web.window.model.DocumentQueryOrderBy> queryOrderBys = getOrderBys();
    if ((queryOrderBys != null) && (!(queryOrderBys.isEmpty()))) {
        return queryOrderBys;
    }
    return entityBinding.getDefaultOrderBys();
}