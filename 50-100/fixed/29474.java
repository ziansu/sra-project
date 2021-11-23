@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_about);
    versionTextView = ((android.widget.TextView) (findViewById(R.id.version)));
    try {
        versionTextView.setText(getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
    } catch (android.content.pm.PackageManager e) {
        versionTextView.setText("?");
    }
}