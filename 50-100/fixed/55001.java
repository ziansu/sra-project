public com.project.onur.playerx.User collectUserData(com.google.firebase.auth.FirebaseUser _mUser) {
    com.project.onur.playerx.User _user = new com.project.onur.playerx.User();
    _user.setUserID(_mUser.getUid());
    _user.setEmail(_mUser.getEmail());
    _user.setUsername(_mUser.getDisplayName());
    _user.setLastLocation((((latitude) + ",") + (longitude)));
    _user.setProfilURL(_mUser.getPhotoUrl().toString());
    _user.setRange(com.project.onur.playerx.activity.LoginActivity.DEFAULT_RANGE);
    return _user;
}