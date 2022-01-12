@java.lang.Override
public void run() {
    blade.plugin.sql2o.ds.DataSourceManager dm = blade.plugin.sql2o.ds.DataSourceManager.me();
    dm.run();
    javax.sql.DataSource dataSource = dm.getDataSource();
    if ((null == dataSource) && (null == (dm.getSql2o()))) {
        LOGGER.error("blade sql2o config fail!");
    }else {
        LOGGER.debug("blade sql2o config success!");
    }
}