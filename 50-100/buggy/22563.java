protected synchronized void setServoPosition(int pinAddress, int value) {
    byte[] command = new byte[]{ ((byte) (132)) , ((byte) (pinAddress)) , ((byte) (value & 127)) , ((byte) ((value >> 7) & 127)) };
    while (isMoving()) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
        }
    } 
    write(command);
}