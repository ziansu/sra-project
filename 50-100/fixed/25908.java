@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if ((mItemTouchHelper) == null) {
        filter(mQuery, mToggleButton.isChecked());
    }else {
        if (isChecked) {
            mItemTouchHelper.attachToRecyclerView(null);
            filter(mQuery, mToggleButton.isChecked());
        }else {
            mItemTouchHelper.attachToRecyclerView(mListView_NESGameList);
            filter(mQuery, mToggleButton.isChecked());
        }
    }
}