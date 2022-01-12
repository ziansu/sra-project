private static void createParentFilters(java.util.List<edu.usc.cssl.tacit.common.queryprocess.Filter> filters, java.util.List<java.lang.String> parentKeys) {
    if (null == filters)
        return ;
    
    java.util.List<java.lang.String> parentFilters = new java.util.ArrayList<java.lang.String>();
    for (edu.usc.cssl.tacit.common.queryprocess.Filter f : filters)
        parentFilters.add(f.getTargetName().split("\\.")[0]);
    
    parentKeys.removeAll(parentFilters);
    for (java.lang.String key : parentKeys) {
        filters.add(new edu.usc.cssl.tacit.common.queryprocess.Filter(key, null, null, null));
    }
}