@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.d(com.swooby.toolbarswitch.MainActivity.TAG, "+onCreate(...)");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    android.util.Log.d(com.swooby.toolbarswitch.MainActivity.TAG, "-onCreate(...)");
}