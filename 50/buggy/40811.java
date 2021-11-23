@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.lang.String URL = dataSnapshot.getValue(java.lang.String.class);
    android.util.Log.d("find the URL", URL);
    new cs48.project.com.parl.ui.fragments.SettingFragment.DownloadImageTask().execute(URL);
}