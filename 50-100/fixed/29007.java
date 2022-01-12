@java.lang.Override
public void onGroupClick(android.widget.AdapterView<?> parent, android.view.View view, int groupPosition, long id, com.mikepenz.materialdrawer.model.interfaces.IDrawerItem drawerItem) {
    if (mListView.isGroupExpanded(groupPosition)) {
        mListView.collapseGroup(groupPosition);
    }else {
        mListView.expandGroup(groupPosition);
    }
}