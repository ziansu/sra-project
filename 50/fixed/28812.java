@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.orhanobut.logger.Logger.init("test").hideThreadInfo().setMethodCount(0);
    printNormalLog();
    printPretty();
}