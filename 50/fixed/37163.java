public static void main(java.lang.String[] args) {
    de.felix_klauke.sansa.server.SansaServer sansaServer = new de.felix_klauke.sansa.server.SimpleSansaServer();
    sansaServer.start();
    sansaServer.registerUsers();
}