private static void filenameList(game.Block[][] Maze, java.lang.String[] filenames) {
    for (int block_row = 0; block_row < (game.App.size); block_row++) {
        for (int block_col = 0; block_col < (game.App.size); block_col++) {
            filenames[((block_row * (game.App.size)) + block_col)] = Maze[block_row][block_col].getBlock();
        }
    }
}