public void startVideoStreaming(java.lang.Class<? extends com.smartdevicelink.streaming.video.SdlRemoteDisplay> remoteDisplay, com.smartdevicelink.streaming.video.VideoStreamingParameters parameters, boolean encrypted) {
    streamListener = startVideoStream(encrypted, parameters);
    try {
        encoder.init(context, null, remoteDisplay, parameters);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}