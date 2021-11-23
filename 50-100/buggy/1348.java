@java.lang.Override
public void run() {
    for (int i = 0; i < 50; i++) {
        io.openio.sds.socket.PooledSocket sock = pool.lease();
        try {
            java.lang.Thread.sleep(10);
            sock.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            org.junit.Assert.fail(e.getMessage());
        }
    }
}