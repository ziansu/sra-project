public com.datasift.client.FutureData<com.datasift.client.pylon.PylonTags> tags(com.datasift.client.pylon.PylonRecording.PylonRecordingId recordingId) {
    java.net.URI uri = newParams().put("id", recordingId).forURL(config.newAPIEndpointURI(TAGS));
    com.datasift.client.FutureData<com.datasift.client.pylon.PylonTags> future = new com.datasift.client.FutureData();
    io.higgs.http.client.Request request = config.http().GET(uri, new io.higgs.http.client.readers.PageReader(newRequestCallback(future, new com.datasift.client.pylon.PylonTags(), config)));
    performRequest(future, request);
    return future;
}