public static void main(java.lang.String[] args) throws java.lang.Exception {
    md.mgmt.connPool.ConnectionPoolImpl poolImpl = new md.mgmt.connPool.ConnectionPoolImpl();
    poolImpl.setMinSize(1);
    poolImpl.setMaxSize(100);
    poolImpl.setDbPath("/data/test/conn");
    poolImpl.setDebug(false);
    for (int i = 0; i < 10; i++) {
        new java.lang.Thread(new md.mgmt.dao.MultiThreadRdbTest()).start();
    }
}