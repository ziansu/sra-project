public static float toCatroidAngle(float box2dAngle) {
    float direction = ((float) ((java.lang.Math.toDegrees(box2dAngle)) + (org.catrobat.catroid.content.Look.getDegreeUserInterfaceOffset()))) % 360;
    if (direction < 0) {
        direction += 360.0F;
    }
    direction = 180.0F - direction;
    return direction;
}