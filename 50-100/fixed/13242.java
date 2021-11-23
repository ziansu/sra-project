void peerFilesFetched(java.lang.String peerAddress, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.nitdgp.arka.psync.FileTable> remoteFiles) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    android.util.Log.d("DEBUG: ", ("Controller file fetch Response code : " + (gson.toJson(remoteFiles).toString())));
    if ((remotePeerFileTableHashMap.get(peerAddress)) != null) {
        remotePeerFileTableHashMap.remove(peerAddress);
    }
    remotePeerFileTableHashMap.put(peerAddress, remoteFiles);
}