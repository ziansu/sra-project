public static synchronized com.kyj.fx.musicserver.MusicServer create(int port) {
    if ((com.kyj.fx.musicserver.MusicServer.getInstance()) != null) {
        try {
            com.kyj.fx.musicserver.MusicServer.getInstance().close();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("can't close musicserver ");
        }
    }
    com.kyj.fx.musicserver.MusicServer.instance = new com.kyj.fx.musicserver.MusicServer(port);
    return com.kyj.fx.musicserver.MusicServer.instance;
}