public java.util.List<com.order.www.domain.db.OrderItemDB> listAllDesignedItem() {
    java.util.List<com.order.www.dao.util.SearchFilter> filters = com.google.common.collect.Lists.newArrayList();
    filters.add(new com.order.www.dao.util.SearchFilter("asinInfo", SearchFilter.Operator.ISNOTNULL, ""));
    filters.add(new com.order.www.dao.util.SearchFilter("asinInfo.status", SearchFilter.Operator.EQ, 1));
    org.springframework.data.jpa.domain.Specification<com.order.www.domain.db.OrderItemDB> spec = com.order.www.dao.util.DynamicSpecifications.bySearchFilter(filters, com.order.www.domain.db.OrderItemDB.class);
    return orderItemDao.findAll(spec);
}