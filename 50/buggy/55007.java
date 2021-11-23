@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.wewow.utils.Utils.setActivityToBeFullscreen(this);
    setContentView(R.layout.activity_lifelab_list);
    this.getSupportActionBar().setTitle(R.string.lifelab_title);
    this.setupUI();
}