private void handleBlockShaped() {
    for (int i = 0; i < 100; i++) {
        if ((scan) == null) {
            return ;
        }
        if (getCachedBlocks().contains(scan)) {
            handleSingleBlock();
            nextLocation();
            return ;
        }else {
            nextLocation();
        }
    }
}