public boolean onLongClick(int index) {
    if ((mLastLongPressIndex) == null) {
        if (mFastAdapter.getAdapterItem(index).isSelectable()) {
            mLastLongPressIndex = index;
            mFastAdapter.select(index);
            if ((mActionModeHelper) != null)
                mActionModeHelper.checkActionMode(null);
            
            return true;
        }
    }else
        if ((mLastLongPressIndex) != index) {
            selectRange(mLastLongPressIndex, index, true);
            mLastLongPressIndex = null;
        }
    
    return false;
}