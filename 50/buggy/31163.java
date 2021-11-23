@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getFragmentManager().beginTransaction().replace(R.id.container, new ru.wilix.device.geekbracelet.MainFragment()).addToBackStack("main").commit();
}