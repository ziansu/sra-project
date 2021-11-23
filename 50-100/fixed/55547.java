public void release() {
    if ((rendererBuilder) != null) {
        rendererBuilder.cancel();
    }
    if ((audioCapabilitiesReceiver) != null) {
        audioCapabilitiesReceiver.unregister();
        audioCapabilitiesReceiver = null;
    }
    rendererBuildingState = com.devbrackets.android.exomedia.core.exoplayer.EMExoPlayer.RenderBuildingState.IDLE;
    surface = null;
    player.release();
    stayAwake(false);
}