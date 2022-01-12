private void MenuItems_setEnabled(boolean loggedIn) {
    CarIOListButton.setEnabled(loggedIn);
    LoginUser.setEnabled((!loggedIn));
    LogoutUser.setEnabled(loggedIn);
    VehiclesButton.setEnabled(loggedIn);
    UsersButton.setEnabled(loggedIn);
    SettingsItem.setEnabled((loggedIn && (isAdmin)));
}