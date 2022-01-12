@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_media_recorder);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    myContext = this;
    fileName = getIntent().getExtras().getString("fileName");
    currentQuestion = getIntent().getExtras().getString("currentQuestion");
    initialize();
    setCamera(findFrontFacingCamera());
    videoTask = new recruitapp.ittproject3.com.recruitmentapp.helper.MediaRecorderActivity.VideoCaptureASyncTask();
    videoTask.execute();
}