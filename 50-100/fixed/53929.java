boolean noFilterSet(de.hk.wfh.rs.FilterContext filterContext) {
    int sizeFilter = ((filterContext.getFilterList()) == null) ? 0 : filterContext.getFilterList().size();
    int sizeIgnore = ((filterContext.getIgnoreList()) == null) ? 0 : filterContext.getIgnoreList().size();
    return (sizeFilter == 0) && (sizeIgnore == 0);
}