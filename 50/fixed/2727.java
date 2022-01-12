@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mGroups.size()) > 0)
        mListView.expandGroup(((mGroups.size()) - 1));
    
}