public static org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoveryUtils.ParsedAdvertisement parseManufacturerData(byte[] manufacturerData, java.util.UUID serviceUuid) {
    org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoveryUtils.ParsedAdvertisement parsedAdvertisement = null;
    if (serviceUuid != null) {
        parsedAdvertisement = org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoveryUtils.parseManufacturerData(manufacturerData);
        if (parsedAdvertisement != null) {
            parsedAdvertisement.provideBluetoothMacAddressRequestId = org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoveryUtils.checkIfUuidContainsProvideBluetoothMacAddressRequestId(parsedAdvertisement.uuid, serviceUuid);
        }
    }
    return parsedAdvertisement;
}