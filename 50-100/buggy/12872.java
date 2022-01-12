private void pause(Bluetooth.BluetoothInterface.Packet packet) {
    if (playing) {
        try {
            Audio.SongPlayer.sleepNanos(packet.launchTime);
        } catch (java.lang.InterruptedException e) {
            java.lang.System.out.println(e);
        }
        speakerCache.stop();
        playing = false;
        java.lang.System.out.println("Pause");
    }
}