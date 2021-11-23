@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    initViews();
    addEvents();
    operation = new com.usr.thermostat.Operations(this, socketHandler);
    count = new com.usr.thermostat.MainActivity.Counter();
    java.lang.Thread countThread = new java.lang.Thread(count);
    countThread.start();
    timer = new com.usr.thermostat.MainActivity.Timer();
    java.lang.Thread timeThread = new java.lang.Thread(timer);
    timeThread.start();
}