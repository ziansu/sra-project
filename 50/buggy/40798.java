private void checkSubtitleCapabilityWithPairingLevel(com.connectsdk.discovery.DiscoveryManager.PairingLevel level) {
    com.connectsdk.discovery.DiscoveryManager.init(Robolectric.application);
    com.connectsdk.discovery.DiscoveryManager.getInstance().setPairingLevel(level);
    junit.framework.Assert.assertTrue(service.hasCapability(MediaPlayer.Subtitle_SRT));
}