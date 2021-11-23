public static void main(java.lang.String[] args) throws java.lang.Throwable {
    com.firefly.server.http2.servlet.ServerBootstrap bootstrap = new com.firefly.server.http2.servlet.ServerBootstrap("firefly-server1.xml", "localhost", 6656);
    bootstrap.start();
    java.lang.Thread.sleep(2000L);
    bootstrap.stop();
}