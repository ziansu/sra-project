public void run() {
    while (running) {
        try {
            java.lang.String bitstream = arduino.inputBuffer;
            main.SpeedAngle sa = arduino.readSpeedAngle();
            if (bitstream != "") {
                gui.setReceivedValues(sa.speed, sa.angle, bitstream);
            }
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}