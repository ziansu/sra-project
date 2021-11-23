@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.frameLayout, new kmitl.lab05.tiwipab58070044.simplemydot.fragment.MainFragment()).addToBackStack("simpleMyDotFragment").commit();
    }
}