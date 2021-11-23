private void logout() {
    framgia.vn.framgiacrb.activity.MainActivity.sCurrentDate = null;
    new framgia.vn.framgiacrb.data.local.EventRepositoriesLocal(io.realm.Realm.getDefaultInstance()).clearDatabase(null);
    mEditor.clear();
    mEditor.apply();
    startActivity(new android.content.Intent(this, framgia.vn.framgiacrb.activity.LoginActivity.class));
    finish();
}