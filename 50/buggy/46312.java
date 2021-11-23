public void setSqlManager(org.nutz.dao.SqlManager sqls) {
    this.sqlManager = sqls;
    int count = sqls.count();
    if (sqls != null)
        org.nutz.dao.impl.DaoSupport.log.debug(("SqlManager Sql count=" + count));
    
}