@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.lang.String URL = dataSnapshot.getValue(java.lang.String.class);
    new cs48.project.com.parl.ui.fragments.SettingFragment.DownloadImageTask().execute(URL);
}