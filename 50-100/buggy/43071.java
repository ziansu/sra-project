public void onEvent(blueprint.com.sage.events.users.UserListEvent event) {
    mUsers = event.getUsers();
    if ((mSchool) != null)
        mUsers.add(0, mSchool.getDirector());
    
    mUserAdapter.setUsers(mUsers);
    if ((mSchool) != null)
        setUserSpinner();
    
}