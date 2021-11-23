@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    bulkMode = !(bulkMode);
    if (bulkMode) {
        lv.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
        lv.setItemChecked(position, true);
        selectedNum = 1;
        mListener.onFragmentInteraction(1);
    }else
        disableBulkMode();
    
    return true;
}