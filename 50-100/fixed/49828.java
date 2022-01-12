private void performSelect(android.view.View v, int position, boolean withCallback) {
    if ((position == 0) || (mMultiChoiceAdapter.isHeader(position)))
        return ;
    
    mMultiChoiceAdapter.performActivation(v, true);
    mSelectedList.put(position, v);
    updateToolbarIfInMultiChoiceMode(mSelectedList.size());
    updateMultiChoiceMode();
    if (((multiChoiceSelectionListener) != null) && withCallback)
        multiChoiceSelectionListener.OnItemSelected(position, mSelectedList.size(), mAllList.size());
    
}