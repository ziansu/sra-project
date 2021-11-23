public static int calculateLinearArrayPosition(int x, int y, int worldWidth) {
    int returnValue = (y * worldWidth) + x;
    java.lang.System.out.println(("linear array index: " + returnValue));
    return returnValue;
}