@java.lang.Override
protected void onLayout(boolean changed, int l, int t, int r, int b) {
    if (!changed)
        return ;
    
    updateBottomViews();
    if ((mOnLayoutListeners) != null)
        for (int i = 0; i < (mOnLayoutListeners.size()); i++) {
            mOnLayoutListeners.get(i).onLayout(this);
        }
    
}