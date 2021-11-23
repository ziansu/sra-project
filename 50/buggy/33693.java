protected int getPrevLoadingPosition(L list) {
    if ((list == null) || ((mHasMore) && ((list.size()) == 0)))
        return 0;
    
    return -1;
}