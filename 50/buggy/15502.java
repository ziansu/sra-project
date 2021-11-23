@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.millennialmedia.android.MMSDK.initialize(this);
    setContentView(R.layout.activity_main);
    new com.skyweather.MainActivity.CallApi().execute();
}