@java.lang.Override
public boolean onChildClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, int childPosition, long id) {
    final com.wireless.pojo.menuMgr.Kitchen kitchenSelected = mDeptNodes.get(groupPosition).getValue().get(childPosition).getKey();
    if (!(kitchenSelected.equals(mCurrentKitchen))) {
        mCurrentKitchen = kitchenSelected;
        if ((mOnKitchenChangeListener) != null) {
            mOnKitchenChangeListener.onKitchenChange(mCurrentKitchen);
        }
    }
    return true;
}