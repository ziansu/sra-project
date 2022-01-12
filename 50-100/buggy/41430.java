private void logout() {
    framgia.vn.framgiacrb.activity.MainActivity.sCurrentDate = null;
    new framgia.vn.framgiacrb.data.local.EventRepositoriesLocal(io.realm.Realm.getDefaultInstance()).clearDatabase(new io.realm.Realm.Transaction.OnSuccess() {
        @java.lang.Override
        public void onSuccess() {
            android.widget.Toast.makeText(framgia.vn.framgiacrb.activity.MainActivity.this, "Logout Success!", Toast.LENGTH_SHORT).show();
        }
    });
    mEditor.clear();
    mEditor.apply();
    startActivity(new android.content.Intent(this, framgia.vn.framgiacrb.activity.LoginActivity.class));
    finish();
}