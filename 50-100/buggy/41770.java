private static void floatTest() {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            ruraomsk.list.ru.strongsql.server.Server server = new ruraomsk.list.ru.strongsql.server.Server();
            server.getConnection();
        }
    }).start();
    try {
        java.lang.Thread.sleep(3000);
        ruraomsk.list.ru.strongsql.server.Client client = new ruraomsk.list.ru.strongsql.server.Client(new java.sql.Timestamp(java.lang.System.currentTimeMillis()), new java.sql.Timestamp(0L), 2, true);
        client.connectToServer();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}