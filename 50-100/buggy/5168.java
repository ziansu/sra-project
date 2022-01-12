@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.startactivity);
    getSupportFragmentManager().beginTransaction().add(R.id.startscreenlayout, new com.bam.darkhouseextreme.app.fragments.StartScreenFragment(), "startScreen").commit();
}