private void populateListView() {
    java.util.List<java.lang.String> groupNames = new java.util.ArrayList<java.lang.String>();
    for (android.util.Pair<java.lang.String, ca.dal.group5.jukefit.Model.Group> pair : savedGroups) {
        groupNames.add(pair.first);
    }
    groupsListAdapter.clear();
    groupsListAdapter.addAll(groupNames);
    groupsListAdapter.notifyDataSetChanged();
}