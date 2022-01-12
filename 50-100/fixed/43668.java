private void createStaticMap() {
    int[][] newMap = new int[3][3];
    newMap[2] = new int[]{ 0 , 0 , 0 };
    newMap[1] = new int[]{ 0 , 1 , 0 };
    newMap[0] = new int[]{ 1 , 1 , 1 };
    map = newMap;
}