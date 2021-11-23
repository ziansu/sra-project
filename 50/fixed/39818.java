public de.d4k.tinkerforge.stromui.main.Ampel gruen() throws com.tinkerforge.NotConnectedException, com.tinkerforge.TimeoutException {
    industrialQuadRelay.setValue(((1 << 3) | (industrialQuadRelay.getValue())));
    return this;
}