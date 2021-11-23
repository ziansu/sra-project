public static <T> com.zes.squad.gmh.common.entity.PagedList<T> newPagedList(int pageNum, int pageSize) {
    com.zes.squad.gmh.common.entity.PagedList<T> pagedList = new com.zes.squad.gmh.common.entity.PagedList();
    pagedList.setPageNum(pageNum).setPageSize(pageSize).setTotalCount(0L).setTotalPages(0).setData(com.google.common.collect.Lists.newArrayList());
    return pagedList;
}