static void writeChunk(java.lang.String streamId, java.lang.String data, com.facebook.react.bridge.Callback callback) {
    com.RNFetchBlob.RNFetchBlobFS fs = com.RNFetchBlob.RNFetchBlobFS.fileStreams.get(streamId);
    java.io.OutputStream stream = fs.writeStreamInstance;
    byte[] chunk = com.RNFetchBlob.RNFetchBlobFS.stringToBytes(data, fs.encoding);
    try {
        stream.write(chunk);
        callback.invoke();
        chunk = null;
    } catch (java.lang.Exception e) {
        callback.invoke(e.getLocalizedMessage());
    }
}