private void triggerUserRoleChanged() {
    assert (activeUserRoleFragment) != null;
    activeUserRoleFragment.onUserRoleChanged();
}