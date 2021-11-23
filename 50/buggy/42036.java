private void appendSort(com.ms.framework.dao.core.paging.PagingBounds.SortEntity sortEntity, java.lang.StringBuilder sqlBuilder) {
    sqlBuilder.append("order by ").append(sortEntity.getOrderProperty()).append(" ").append(sortEntity.getDirection().name());
}