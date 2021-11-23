@java.lang.Override
public void onStreamDestroyed(com.opentok.android.PublisherKit publisherKit, com.opentok.android.Stream stream) {
    android.util.Log.i(com.tokbox.android.otsdkwrapper.wrapper.OTWrapper.LOG_TAG, "ONSTREAM DESTROYED");
    boolean screensharing = false;
    if ((stream.getStreamVideoType()) == (Stream.StreamVideoType.StreamVideoTypeScreen)) {
        screensharing = true;
    }else {
        isPublishing = false;
    }
    for (com.tokbox.android.otsdkwrapper.listeners.BasicListener listener : mBasicListeners) {
        ((com.tokbox.android.otsdkwrapper.listeners.RetriableBasicListener) (listener)).onStoppedPublishingMedia(SELF, screensharing);
    }
}