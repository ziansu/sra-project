@java.lang.Override
protected java.lang.Object[] voToObjectArray(com.serotonin.m2m2.watchlist.WatchListVO vo) {
    return new java.lang.Object[]{ vo.getXid() , vo.getName() , vo.getUserId() , vo.getEditPermission() , vo.getReadPermission() , vo.getType() , vo.getQuery() };
}