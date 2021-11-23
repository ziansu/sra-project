private void updateUI() {
    if (!((retrievedgrouplist) == null)) {
        final java.util.ArrayList<www.weride.com.classes.Group> groups = retrievedgrouplist;
        www.weride.com.classes.GroupsListAdapter adapter = new www.weride.com.classes.GroupsListAdapter(this.getContext(), groups, at);
        groupsview.setAdapter(adapter);
    }
}