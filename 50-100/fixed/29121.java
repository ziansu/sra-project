@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_screen_launcher);
    new java.util.Timer().schedule(new java.util.TimerTask() {
        public void run() {
            fr.wcs.battlegeek.ScreenLauncher.this.runOnUiThread(new java.lang.Runnable() {
                public void run() {
                    startActivity(new android.content.Intent(fr.wcs.battlegeek.ScreenLauncher.this, fr.wcs.battlegeek.MainMenuActivity.class));
                }
            });
        }
    }, 2500);
}