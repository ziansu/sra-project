public void writeAll(java.lang.String str) {
    android.util.Log.d("Server", "Attempting to write to all clients");
    for (com.semaphore_soft.apps.cypher.networking.Server.ClientHandler server : com.semaphore_soft.apps.cypher.networking.Server.clients) {
        server.write(str);
    }
}