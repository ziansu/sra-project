public static float toBox2dAngle(float catroidAngle) {
    return ((float) (java.lang.Math.toRadians((((-catroidAngle) + (org.catrobat.catroid.content.Look.getDegreeUserInterfaceOffset())) % 360))));
}