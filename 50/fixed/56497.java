public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    startService(new android.content.Intent(this, ru.mityaresh.cadromonitor.MyService.class));
    finish();
}