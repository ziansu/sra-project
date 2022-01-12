private void onBlockClick(android.view.View view, io.rover.model.Block block) {
    if ((block != null) && ((mBlockListener) != null)) {
        mBlockListener.onBlockClick(block);
    }
}