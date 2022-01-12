private int getWidth() {
    mWidth = 0;
    for (fr.wcs.battlegeek.ui.Block block : mBlocks) {
        if ((block.getX()) > (mWidth))
            mWidth = ((int) (block.getX()));
        
    }
    return mWidth;
}