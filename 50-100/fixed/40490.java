public static boolean closeEnough(battlecode.common.Direction dir1, battlecode.common.Direction dir2, float degreesOk) {
    if ((dir1 == null) || (dir2 == null)) {
        return false;
    }
    return (java.lang.Math.abs(dir1.degreesBetween(dir2))) <= degreesOk;
}