@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((com.context.kroket.escapeapp.MainActivity.wakeupScreen) == true) {
        android.app.KeyguardManager km = ((android.app.KeyguardManager) (getSystemService(Context.KEYGUARD_SERVICE)));
        android.app.KeyguardManager.KeyguardLock keyguardLock = km.newKeyguardLock("TAG");
        keyguardLock.disableKeyguard();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
    }
    setContentView(R.layout.activity_main);
}