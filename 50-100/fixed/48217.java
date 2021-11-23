public static net.jplugin.core.das.api.DataSourceHolder getInstance() {
    if ((net.jplugin.core.das.api.DataSourceHolder.instance) != null)
        return net.jplugin.core.das.api.DataSourceHolder.instance;
    else {
        synchronized(net.jplugin.core.das.api.DataSourceHolder.class) {
            if ((net.jplugin.core.das.api.DataSourceHolder.instance) != null) {
                return net.jplugin.core.das.api.DataSourceHolder.instance;
            }else {
                net.jplugin.core.das.api.DataSourceHolder.instance = new net.jplugin.core.das.api.DataSourceHolder();
                return net.jplugin.core.das.api.DataSourceHolder.instance;
            }
        }
    }
}