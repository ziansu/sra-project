@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, new dannylui.c4q.nyc.surfaceviewdragdrop.MainFragment()).commit();
}