private void restoreLastTransportState(org.eclipse.smarthome.binding.sonos.handler.ZonePlayerHandler coordinator, java.lang.String nextAction) {
    switch (nextAction) {
        case "PLAYING" :
            coordinator.play();
            coordinator.waitForTransportState("PLAYING");
            break;
        case "PAUSED_PLAYBACK" :
            coordinator.pause();
            break;
    }
}