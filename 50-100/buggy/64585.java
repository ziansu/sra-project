protected void getStoneCount() {
    counts = new int[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 };
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            int index = ((myPackage.Utils.GEM) (board[i][j])).ordinal();
            (counts[index])++;
        }
    }
}