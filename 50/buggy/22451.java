private void onBlockClick(android.view.View view, int position) {
    io.rover.model.Block block = getBlockAtPosition(position);
    if ((block != null) && ((mBlockListener) != null)) {
        mBlockListener.onBlockClick(block);
    }
}