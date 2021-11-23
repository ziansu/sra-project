public void setNewPermissions() {
    currentUser.setPermissions(selectedPermissions);
    userService.update(currentUser);
}