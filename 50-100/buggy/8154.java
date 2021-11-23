private void initBlocks(android.content.Context context) {
    for (int i = 0; i < ((com.waterfall.thomaswatson.theprovider.PlayerArea.blockXAmount) * (com.waterfall.thomaswatson.theprovider.PlayerArea.blockYAmount)); i++) {
        com.waterfall.thomaswatson.theprovider.Block block = new com.waterfall.thomaswatson.theprovider.Block(context);
        int yPos = 0;
        if ((i % (com.waterfall.thomaswatson.theprovider.PlayerArea.blockXAmount)) == 0) {
            block.setYPosition((yPos++));
        }
        block.setXPosition((i % (com.waterfall.thomaswatson.theprovider.PlayerArea.blockXAmount)));
        blocks.add(block);
    }
}