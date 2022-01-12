public <T> org.nutz.dao.entity.Entity<T> reloadEntity(org.nutz.dao.Dao dao, java.lang.Class<T> classOfT) {
    final org.nutz.dao.entity.Entity<T> re = maker.make(classOfT);
    synchronized(map) {
        map.put(classOfT, re);
    }
    support.expert.createEntity(dao, re);
    support.run(new org.nutz.dao.ConnCallback() {
        public void invoke(java.sql.Connection conn) throws java.lang.Exception {
            support.expert.setupEntityField(conn, re);
        }
    });
    return re;
}