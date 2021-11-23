@java.lang.Override
public co.blustor.gatekeepersdk.devices.Response list(java.lang.String cardPath) throws java.io.IOException {
    cardPath = globularPath(cardPath);
    return get(co.blustor.gatekeepersdk.devices.GKBluetoothCard.LIST, cardPath, createDataFile());
}