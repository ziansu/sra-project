@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    screen = ((android.widget.TextView) (findViewById(R.id.textView)));
    screen.setText(display);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    org.apache.log4j.Layout lay1 = new org.apache.log4j.PatternLayout("[%p] %c - %m - %d %n Thread: %t - Method: %M - Line: %L - %x");
    org.apache.log4j.Appender app1 = new org.apache.log4j.ConsoleAppender(lay1);
    org.apache.log4j.BasicConfigurator.configure(app1);
    logger = org.apache.log4j.Logger.getRootLogger();
    java.lang.Float x1 = 8.9F;
    java.lang.Float x2 = 1.0F;
    java.lang.System.out.println((x1 - x2));
}