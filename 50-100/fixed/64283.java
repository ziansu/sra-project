@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle extras = getIntent().getExtras();
    if ((extras != null) && (extras.getBoolean("cdvStartInBackground", false))) {
        moveTaskToBack(true);
    }
    loadUrl(launchUrl);
}