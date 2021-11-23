public void rotate() {
    if (generated) {
        java.util.ArrayList<Block> tempBlocks = copyBlocks(gamePieceBlocks);
        boolean success = attemptRotate(tempBlocks, true);
        if (success == true) {
            attemptRotate(gamePieceBlocks, false);
        }
    }
}