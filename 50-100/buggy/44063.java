public void init() {
    try {
        edu.umass.ckc.wo.smgr.SessionManager.loadDbDriver();
        this.conn = edu.umass.ckc.wo.db.DbUtil.getAConnection();
        this.smgr = new edu.umass.ckc.wo.smgr.SessionManager(conn);
        this.conn = conn;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}