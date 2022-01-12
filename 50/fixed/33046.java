@java.lang.Override
public void clear() {
    mPages.evictAll();
    mMinPageIndex = -1;
    mMaxPageIndex = 0;
    mSize = 0;
    if ((mListener) != null)
        mListener.onPagesCleared();
    
}