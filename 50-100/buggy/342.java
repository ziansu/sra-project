boolean isBuilding(int tile) {
    java.lang.System.out.println(("FOUND " + tile));
    if ((tile > 64) && (tile < 208)) {
        java.lang.System.out.println("1");
        return true;
    }
    if ((tile > 223) && (tile < 828)) {
        java.lang.System.out.println("2");
        return true;
    }
    if ((tile > 831) && (tile < 948)) {
        java.lang.System.out.println("3");
        return true;
    }
    return false;
}