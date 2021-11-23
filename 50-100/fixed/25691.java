public void run() {
    while (running) {
        try {
            java.lang.String bitstream = arduino.inputBuffer;
            if (!(bitstream.isEmpty())) {
                main.SpeedAngle sa = arduino.readSpeedAngle();
                gui.setReceivedValues(sa.speed, sa.angle, bitstream);
            }
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}