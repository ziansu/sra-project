public void viewBlocks(GameInfo.Environment.Blocks.BlockBase[][] blocks) {
    for (int x = 0; x < (blocks.length); x++) {
        for (int y = 0; y < (blocks[x].length); y++) {
            if ((blocks[x][y]) == null) {
                java.lang.System.out.print("NULL|");
            }else {
                java.lang.System.out.print("GOOD|");
            }
        }
        java.lang.System.out.println();
    }
}