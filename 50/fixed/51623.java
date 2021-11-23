@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dashboard);
    this.mCurrentUser = this.mSession.getCurrentUser();
    this.bindUi();
}