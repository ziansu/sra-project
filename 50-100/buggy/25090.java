@java.lang.Override
public java.lang.String toString() {
    int red = bad.robot.blinkstick.Color.toUnsignedInt(((rgb()) >> 16));
    int green = bad.robot.blinkstick.Color.toUnsignedInt(((rgb()) >> 8));
    int blue = bad.robot.blinkstick.Color.toUnsignedInt(rgb());
    return java.lang.String.format("#%02X%02X%02X", red, green, blue);
}