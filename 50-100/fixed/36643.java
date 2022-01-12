public boolean isOn() {
    boolean on = false;
    for (net.licks92.WirelessRedstone.Signs.WirelessTransmitter transmitter : transmitters) {
        if (transmitter.isActive()) {
            on = true;
        }
    }
    return (net.licks92.WirelessRedstone.ConfigManager.getConfig().useORLogic()) && on;
}