public static long getBlocksToDeduct(float currentMoneyToSpend, java.lang.Double purchaseAmount, java.lang.Double staticBlockPrice, long setupDay, long payDate, long todaysBlocks) {
    double currentDisplayedBlocks = com.ast.blocksave.Utils.getBlocksToDisplay(currentMoneyToSpend, setupDay, payDate, staticBlockPrice, todaysBlocks);
    double newDisplayBlocks = com.ast.blocksave.Utils.getBlocksToDisplay((currentMoneyToSpend - purchaseAmount), setupDay, payDate, staticBlockPrice, todaysBlocks);
    long blocksToDeduct = java.lang.Math.round((currentDisplayedBlocks - newDisplayBlocks));
    return blocksToDeduct;
}