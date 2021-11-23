public com.project.onur.playerx.User collectUserData(com.google.firebase.auth.FirebaseUser _mUser) {
    com.project.onur.playerx.User _user = new com.project.onur.playerx.User();
    user.setUserID(_mUser.getUid());
    user.setEmail(_mUser.getEmail());
    user.setUsername(_mUser.getDisplayName());
    user.setLastLocation((((latitude) + ",") + (longitude)));
    user.setProfilURL(_mUser.getPhotoUrl().toString());
    user.setRange(com.project.onur.playerx.activity.LoginActivity.DEFAULT_RANGE);
    return _user;
}