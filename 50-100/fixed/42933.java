protected void initComponent() {
    super.initComponent();
    if (((nativePeer) != null) && ((nativePeer[0]) != 0)) {
        com.codename1.impl.ios.IOSImplementation.nativeInstance.peerInitialized(nativePeer[0], getAbsoluteX(), getAbsoluteY(), getWidth(), getHeight());
    }
}