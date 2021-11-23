@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    trace.traceapp.StartDraw.appLocationManager = MainActivity.appLocationManager;
    setContentView(R.layout.activity_main);
    drawView = new trace.traceapp.DrawView(this);
    drawView.setBackgroundColor(Color.WHITE);
    setContentView(drawView);
    drawView.setWillNotDraw(false);
    arraySize = drawView.getLocArraySize();
}