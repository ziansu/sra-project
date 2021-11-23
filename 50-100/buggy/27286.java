@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_embedded_recorder);
    com.ziggeo.androidsdk.Ziggeo ziggeo = new com.ziggeo.androidsdk.Ziggeo(com.ziggeo.androidsdk.demo.EmbeddedRecorderActivity.APP_TOKEN);
    long maxDuration = 20000L;
    ziggeo.setSendImmediately(false);
    ziggeo.attachRecorder(getSupportFragmentManager(), R.id.fl_content, maxDuration, this);
}