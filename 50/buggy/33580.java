@java.lang.Override
@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
public void onBuildHeaders(java.util.List<com.example.abhijeetsinghkgp.popularmovies.Header> target) {
    loadHeadersFromResource(R.xml.pref_headers, target);
    setContentView(R.layout.settings);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    setupActionBar();
}