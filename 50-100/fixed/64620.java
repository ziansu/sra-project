public static int[][] get2x2TransverseCofactor(int[][] k3) {
    return new int[][]{ new int[]{ k3[1][1] , -(k3[0][1]) } , new int[]{ -(k3[1][0]) , k3[0][0] } };
}