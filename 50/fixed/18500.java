@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    parentView = getLayoutInflater().inflate(R.layout.activity_selectimg, null);
    setContentView(parentView);
    hyzk.smartkeydevice.app.ActivityList.getInstance().addActivity(this);
    Init();
}