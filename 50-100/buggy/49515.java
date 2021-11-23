@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.main);
    tw.edu.ntu.fortour.ForTour.mDbHelper = new tw.edu.ntu.fortour.DbAdapter(this);
    tw.edu.ntu.fortour.ForTour.mDbHelper.open();
    checkWorkDirs();
    findviews();
    setCamera();
    setButtonListener();
}