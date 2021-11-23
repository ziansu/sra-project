void peerFilesFetched(java.lang.String peerAddress, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.nitdgp.arka.psync.FileTable> remoteFiles) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    android.util.Log.d("DEBUG: ", ("Controller file fetch Response code : " + (gson.toJson(remoteFiles).toString())));
    remotePeerFileTableHashMap.put(peerAddress, remoteFiles);
}