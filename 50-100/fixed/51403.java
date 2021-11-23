@java.lang.Override
public void onConnected(com.neovisionaries.ws.client.WebSocket websocket, java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers) throws java.lang.Exception {
    super.onConnected(websocket, headers);
    android.util.Log.i(com.harryio.storj.util.network.StorjWebSocketAdapter.TAG, "onConnected: ");
    websocket.sendText(authJson);
    java.io.File shardFile = new java.io.File(shardFilePath);
    byte[] shardBytes = com.harryio.storj.util.FileUtils.fileToByteArray(shardFile);
    android.util.Log.i(com.harryio.storj.util.network.StorjWebSocketAdapter.TAG, ("Shard bytes length: " + (shardBytes.length)));
    websocket.sendBinary(shardBytes);
}