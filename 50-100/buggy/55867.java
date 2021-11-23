@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new com.example.velibisk.rssreader.ui.ProgressFragment(), com.example.velibisk.rssreader.ui.MainActivity.PROGRESS_FRAGMENT_TAG).commit();
    getSupportLoaderManager().initLoader(0, null, this);
}