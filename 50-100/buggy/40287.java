public static void main(java.lang.String[] args) {
    java.util.List<int[][]> blocks = new java.util.ArrayList<int[][]>();
    while ((blocks.size()) < 50) {
        try {
            int[][] randomBlock = TetrisBlocks.generateRandomTetrisBlock();
            if (!(blocks.contains(randomBlock))) {
                blocks.add(randomBlock);
                TetrisBlocks.printBlock(randomBlock);
            }
        } catch (java.lang.Exception e) {
        }
    } 
}