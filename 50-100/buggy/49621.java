public static boolean isValid(int x, int y, int z) {
    return (((((x < 0) || (x >= (Board.WIDTH))) || (y < 0)) || (y >= (Board.DEPTH))) || (z < 0)) || (z >= (Board.HEIGHT));
}