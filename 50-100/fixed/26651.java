public java.util.ArrayList<java.lang.String> addDotComToMap() {
    int i;
    java.util.ArrayList<java.lang.String> locGridArray = new java.util.ArrayList<java.lang.String>();
    boolean isPlaced = false;
    do {
        isPlaced = placeDotComOnGridMap();
    } while (!isPlaced );
    for (i = 0; i < 3; i++) {
        java.lang.System.out.println(java.util.Arrays.toString(locGridCoords.get(i)));
    }
    convertGridToStringCoords();
    return this.locGridArray;
}