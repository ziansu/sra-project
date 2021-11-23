private int[][] LeftMove(int[] key56) {
    int[][] keys = new int[16][56];
    for (int i = 0; i < 16; i++) {
        keys[i] = LeftMoveCore(key56, KeyGenerate.LeftMove[i]);
    }
    return keys;
}