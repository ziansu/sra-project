private void pause(Bluetooth.BluetoothInterface.Packet packet) {
    if (playing) {
        new java.lang.Thread(() -> {
            try {
                Audio.SongPlayer.sleepNanos(packet.launchTime);
            } catch (java.lang.InterruptedException e) {
                java.lang.System.out.println(e);
            }
            java.lang.System.out.println("Pause");
            playing = false;
            speakerCache.stop();
        }).start();
    }
}