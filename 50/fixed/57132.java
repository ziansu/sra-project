@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_maintabs);
    super.onCreate(savedInstanceState);
    fragmentManager = getFragmentManager();
    setTabSelection(0);
}