public static boolean IsMaster() {
    java.lang.String ltType = java.lang.System.getenv("LTTYPE");
    if (ltType == null) {
        return true;
    }
    if (ltType.equals("master")) {
        return true;
    }
    return false;
}