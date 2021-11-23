public static int getFutureLinesVanished(de.slothsoft.tetris.Board board, de.slothsoft.tetris.Stone stone, int blockY) {
    int lines = 0;
    for (int y = 0; y < (stone.getHeightInBlocks()); y++) {
        int stoneBlocks = stone.calculateBlockCountOfLine(y);
        int boardBlocksCount = board.calculateBlockCountOfLine((y + blockY));
        if ((stoneBlocks + boardBlocksCount) == (Board.WIDTH_IN_BLOCKS)) {
            lines++;
        }
    }
    return lines;
}