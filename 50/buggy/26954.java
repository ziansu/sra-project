public static boolean IsMaster() {
    java.lang.String ltType = java.lang.System.getenv("LTTYPE");
    if (ltType == null) {
        ltType = "master";
    }
    if (ltType.equals("master")) {
        return true;
    }
    return false;
}