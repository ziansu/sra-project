private void shift(Bluetooth.BluetoothInterface.Packet packet) {
    Audio.SongPlayer.timePositionOffset += ((int) (packet.launchTime));
}