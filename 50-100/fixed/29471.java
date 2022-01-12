private void updateUI() {
    if (!((retrievedgrouplist) == null)) {
        final java.util.ArrayList<www.weride.com.classes.Group> groups = retrievedgrouplist;
        if ((getActivity()) != null) {
            adapter = new www.weride.com.classes.GroupsListAdapter(getContext(), groups, at);
            groupsview.setAdapter(adapter);
        }
    }
}