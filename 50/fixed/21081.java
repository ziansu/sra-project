@java.lang.Override
public void onCreate() {
    super.onCreate();
    db = new vn.asiantech.training.DatabaseHelper(getBaseContext());
    this.registerReceiver(new vn.asiantech.training.myService.AlarmReceiver(), new android.content.IntentFilter(vn.asiantech.training.myService.ACTION));
}