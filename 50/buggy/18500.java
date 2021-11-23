@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    parentView = getLayoutInflater().inflate(R.layout.activity_selectimg, null);
    hyzk.smartkeydevice.app.ActivityList.getInstance().addActivity(this);
    setContentView(parentView);
    Init();
}