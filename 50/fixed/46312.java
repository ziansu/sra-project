public void setSqlManager(org.nutz.dao.SqlManager sqls) {
    this.sqlManager = sqls;
    if (sqls != null) {
        int count = sqls.count();
        org.nutz.dao.impl.DaoSupport.log.debug(("SqlManager Sql count=" + count));
    }
}