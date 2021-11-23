@java.lang.Override
public void onUpdateItemListener(android.view.View view, int position) {
    if (position == 0)
        return ;
    
    if (mMultiChoiceAdapter.isHeader(position))
        return ;
    
    if (((mMultiChoiceAdapter) != null) && (isInMultiChoiceMode)) {
        if (mSelectedList.containsKey(position))
            performSelect(view, position, false);
        else
            performDeselect(view, position, false);
        
    }
    mAllList.put(position, view);
}