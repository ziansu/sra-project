@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ctrl);
    initHandler();
    initRobotControl();
    initInfoView();
    initVideoView();
    initTestBtn();
    initMoveBtns();
    initServoBtns();
}