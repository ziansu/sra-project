@java.lang.Override
public void cleanup() {
    if ((moviePlayerPeer) != 0) {
        pause();
        if (!(isVideo)) {
            com.codename1.impl.ios.IOSImplementation.nativeInstance.cleanupAudio(moviePlayerPeer);
        }
        removeMediaCallback(onCompletionCallbackId);
        com.codename1.impl.ios.IOSImplementation.nativeInstance.releasePeer(moviePlayerPeer);
        moviePlayerPeer = 0;
    }
}