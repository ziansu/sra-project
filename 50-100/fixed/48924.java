public void setDefaultTabPosition(int defaultTabPosition) {
    if (mIsComingFromRestoredState)
        return ;
    
    if ((mItems) == null) {
        mCurrentTabPosition = defaultTabPosition;
        return ;
    }else
        if ((((mItems.length) == 0) || (defaultTabPosition > ((mItems.length) - 1))) || (defaultTabPosition < 0)) {
            throw new java.lang.IndexOutOfBoundsException((("Can't set default tab at position " + defaultTabPosition) + ". This BottomBar has no items at that position."));
        }
    
    selectTabAtPosition(defaultTabPosition, false);
}