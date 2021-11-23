public de.d4k.tinkerforge.stromui.main.Ampel rot() throws com.tinkerforge.NotConnectedException, com.tinkerforge.TimeoutException {
    industrialQuadRelay.setValue(((1 << 1) | (industrialQuadRelay.getValue())));
    return this;
}