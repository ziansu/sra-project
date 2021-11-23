@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent keyEvent) {
    java.lang.System.out.println(("keyReleased:" + (keyEvent.getKeyChar())));
    keyEvent.getSource();
    char key = keyEvent.getKeyChar();
    switch (key) {
        case hu.oe.nik.szfmv17t.automatedcar.hmi.HMI.STEER_LEFT_KEY :
            steeringWheel.steerLeft();
            break;
        case hu.oe.nik.szfmv17t.automatedcar.hmi.HMI.STEER_RIGHT_KEY :
            steeringWheel.steerRight();
            break;
    }
}