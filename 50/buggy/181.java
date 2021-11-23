public edu.wpi.first.wpilibj.Joystick getJoystick(int n) {
    return n == 0 ? joy0 : n == 1 ? joy1 : joy0;
}