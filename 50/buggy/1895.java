public static void setNextAlternativeChannelOrPort(int channelOrPort) {
    if ((channelOrPort >= 0) && (channelOrPort < (org.thaliproject.p2p.btconnectorlib.internal.bluetooth.BluetoothUtils.MAX_ALTERNATIVE_CHANNEL))) {
        org.thaliproject.p2p.btconnectorlib.internal.bluetooth.BluetoothUtils.mAlternativeChannel = channelOrPort - 1;
    }
}