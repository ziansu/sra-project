public static boolean isValidStop(java.lang.String stop) {
    if (stop == null) {
        return false;
    }
    if (stop.isEmpty()) {
        return false;
    }
    try {
        int stopNum = java.lang.Integer.parseInt(stop);
        if (stopNum <= 0) {
            return false;
        }
        if (stopNum > 100000) {
            return false;
        }
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}