@java.lang.Override
protected void onCurrentProfileChanged(com.facebook.Profile oldProfile, com.facebook.Profile newProfile) {
    if (!(loginResult.getRecentlyDeniedPermissions().isEmpty())) {
        showAlert("Debes aceptar todos los permisos solicitados de tu información de Facebook para usar esta app");
        com.facebook.login.LoginManager.getInstance().logOut();
        return ;
    }
    profileTracker.stopTracking();
    nextActivity(newProfile);
}