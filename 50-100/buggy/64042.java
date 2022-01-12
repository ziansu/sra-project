private void reconfigDefaultFilters(org.apache.shiro.web.filter.mgt.DefaultFilterChainManager manager) {
    for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> conf : defaultFilterConfigs.entrySet()) {
        java.lang.String n = conf.getKey();
        javax.servlet.Filter f = manager.getFilter(n);
        if (f != null) {
            reconfigFilter(f, conf.getValue());
        }
    }
}