@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent sensor = new android.content.Intent(context, v1.app.com.codenutrient.Services.Pedometer.class);
    context.startService(sensor);
}