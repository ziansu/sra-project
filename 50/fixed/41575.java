@java.lang.Override
public void run(float time) {
    if ((Main.colorSensor.getValue()) >= (colorValue)) {
        lejos.hardware.Sound.beep();
        Main.states.popState();
    }
}