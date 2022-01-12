public void moveNextPosition(boolean smooth) {
    if ((getRealAdapter()) == null)
        throw new java.lang.IllegalStateException("You did not set a slider adapter");
    
    if (mIsShuffle) {
        setPagerTransformer(true, getShuffleTransformer());
    }
    mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) + 1), smooth);
}