private void initBlocks(android.content.Context context) {
    for (int x = 0; x <= (com.waterfall.thomaswatson.theprovider.PlayerArea.blockXAmount); x++) {
        for (int y = 0; y < (com.waterfall.thomaswatson.theprovider.PlayerArea.blockYAmount); y++) {
            com.waterfall.thomaswatson.theprovider.Block block = new com.waterfall.thomaswatson.theprovider.Block(context);
            block.setXPosition(x);
            block.setYPosition(y);
            blocks.add(block);
        }
    }
}