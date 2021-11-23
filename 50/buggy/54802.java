@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.akturk.plugin.LocationChecker checker = new com.akturk.plugin.LocationChecker(this);
    checker.setAdapt(true);
    checker.start(mRawData);
}