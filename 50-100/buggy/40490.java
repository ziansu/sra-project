public static boolean closeEnough(battlecode.common.Direction dir1, battlecode.common.Direction dir2, float degreesOk) {
    if ((dir1 == null) || (dir2 == null)) {
        return false;
    }
    float degreesBetween = dir1.degreesBetween(dir2);
    return ((degreesBetween >= 0) && (degreesBetween <= degreesOk)) || ((degreesBetween >= (360 - degreesOk)) && (degreesBetween <= 360));
}