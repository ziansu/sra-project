public void writeToClient(java.lang.String str, int index) {
    android.util.Log.d("Server", ("Attempting to write to client " + (java.lang.String.valueOf(index))));
    if ((!(com.semaphore_soft.apps.cypher.networking.Server.clients.isEmpty())) && (index > 0)) {
        com.semaphore_soft.apps.cypher.networking.Server.clients.get(index).write(str);
    }
}