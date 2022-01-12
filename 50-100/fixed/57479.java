public void tryPlantGardener(int round) throws battlecode.common.GameActionException {
    int degree = 0;
    while (degree < 360) {
        float radian = (((float) (degree)) * ((float) (java.lang.Math.PI))) / 180;
        battlecode.common.Direction direction = new battlecode.common.Direction(radian);
        if ((rc.canHireGardener(direction)) && ((round == 1) || ((round % 60) == 0))) {
            rc.hireGardener(direction);
        }
        degree += 60;
    } 
}