@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_track_list);
    if ((android.os.Build.VERSION.SDK_INT) > 9) {
        android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
        android.os.StrictMode.setThreadPolicy(policy);
    }
    listTracks = ((android.widget.TextView) (findViewById(R.id.list_tracks)));
    new atinyshop.hacorp.laplq.restapi.activities.HttpAsyncTask().execute();
}