@java.lang.Override
protected java.lang.Object[] voToObjectArray(com.serotonin.m2m2.watchlist.WatchListVO vo) {
    return new java.lang.Object[]{ vo.getXid() , vo.getUserId() , vo.getName() , vo.getEditPermission() , vo.getReadPermission() , vo.getType() , vo.getQuery() };
}