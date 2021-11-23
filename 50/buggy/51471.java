private void addDepartment(java.lang.String name) {
    navDrawerAdapter.addDepartment(name);
    drawerListView.expandGroup(edu.ucsd.neurores.MainActivity.STAFF_MENU_GROUP);
}