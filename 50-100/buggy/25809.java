@java.lang.Override
public void keyPressed(lejos.hardware.Key k) {
    if ((bridge) != null) {
        bridge.end();
    }
    if ((chainBridge) != null) {
        chainBridge.end();
    }
    if ((lineFollowing) != null) {
        lineFollowing.end();
    }
    if ((lineFollowing) != null) {
        lineFollowing.end();
    }
    if ((seesaw) != null) {
        seesaw.end();
    }
}