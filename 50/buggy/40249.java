public net.ballmerlabs.scatterbrain.network.BLE.BLEPacket dequeuePacket() {
    net.ballmerlabs.scatterbrain.network.BLE.BLEPacket result = packetqueue.get(0);
    packetqueue.remove(0);
    return result;
}