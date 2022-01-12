@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    com.example.cz264.heroradio.Fragments.MainFragment mainFragment = ((com.example.cz264.heroradio.Fragments.MainFragment) (fm.findFragmentById(R.id.container_main)));
    if (mainFragment == null) {
        mainFragment = com.example.cz264.heroradio.Fragments.MainFragment.newInstance("test1", "test2");
        fm.beginTransaction().add(R.id.container_main, mainFragment).commit();
    }
}