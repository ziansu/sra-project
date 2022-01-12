private boolean validateUnitParam(java.lang.String unit) {
    if (com.robot.Utils.isNumeric(unit)) {
        int x = java.lang.Integer.parseInt(unit);
        if (x <= (robotInfo.getMaxUnits())) {
            return true;
        }else {
            printErrorInfo("Sorry,unit not allowed to greater then MAX_UNITS");
            return false;
        }
    }else {
        printErrorInfo("Sorry,unit must be integer!");
        return false;
    }
}