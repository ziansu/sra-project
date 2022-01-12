public static Node[][] placeTarget(Node[][] map, int row, int col) {
    java.util.Random r = new java.util.Random();
    int rand1 = (r.nextInt(row)) + 0;
    int rand2 = (r.nextInt(col)) + 0;
    map[rand1][rand2].target = true;
    return map;
}