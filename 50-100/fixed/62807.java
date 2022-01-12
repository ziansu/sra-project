private xdtic.projpool.util.Pair<java.util.List<xdtic.projpool.model.User>, java.lang.Long> getUsers(java.lang.String keyword, int pageNum, int pageSize) {
    com.github.pagehelper.Page page = com.github.pagehelper.PageHelper.startPage((pageNum + 1), pageSize);
    java.util.List<xdtic.projpool.model.User> users = userMapper.getUsers(keyword);
    return xdtic.projpool.util.Pair.of(users, page.getTotal());
}