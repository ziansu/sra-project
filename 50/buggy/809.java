@java.lang.Override
public void setSpeed(double speed) {
    for (int i = 0; i < ((motors.size()) - 1); i++) {
        motors.get(i).set(speed);
    }
}