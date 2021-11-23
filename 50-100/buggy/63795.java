@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    long[] pattern = new long[]{ 0 , 500 , 500 , 500 , 500 };
    if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
        android.widget.Toast.makeText(context, "Time to get up!", Toast.LENGTH_LONG).show();
        android.os.Vibrator vibrator = ((android.os.Vibrator) (context.getSystemService(Context.VIBRATOR_SERVICE)));
        vibrator.vibrate(pattern, 0);
    }
}