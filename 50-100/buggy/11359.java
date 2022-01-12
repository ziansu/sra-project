@java.lang.Override
public boolean onChildClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, int childPosition, long id) {
    mListener.onDeleteBpmClick(mGroups.get(groupPosition).children.get(childPosition).getId(), groupPosition, childPosition);
    return false;
}