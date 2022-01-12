public float axisValue(org.firstinspires.ftc.team7316.util.input.GamepadAxis axisIndex) {
    switch (axisIndex) {
        case L_STICK_X :
            return gamepad.left_stick_x;
        case L_STICK_Y :
            return gamepad.left_stick_y;
        case R_STICK_X :
            return gamepad.right_stick_x;
        case R_STICK_Y :
            return gamepad.right_stick_y;
        case L_TRIGGER :
            return gamepad.left_trigger;
        case R_TRIGGER :
            return gamepad.left_trigger;
    }
    throw new java.lang.IllegalArgumentException();
}