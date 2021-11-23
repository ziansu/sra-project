@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final android.app.ActionBar actionBar = getActionBar();
    actionBar.setDisplayShowTitleEnabled(true);
    getFragmentManager().beginTransaction().replace(R.id.container, net.videgro.ships.fragments.ShowMapFragment.newInstance()).commit();
}