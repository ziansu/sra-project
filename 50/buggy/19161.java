@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "T1TTXPJcPzM830GZeCBIupyVU1cMT4tiqByRVFVt", "akwdXIApXkPOGA50FmcbBnWmFCEGatusbOJ1CQnr");
    buildGoogleApiClient();
}