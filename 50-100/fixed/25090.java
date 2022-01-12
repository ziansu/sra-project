@java.lang.Override
public java.lang.String toString() {
    int red = bad.robot.blinkstick.Color.toUnsignedInt(this.red);
    int green = bad.robot.blinkstick.Color.toUnsignedInt(this.green);
    int blue = bad.robot.blinkstick.Color.toUnsignedInt(this.blue);
    return java.lang.String.format("#%02X%02X%02X", red, green, blue);
}