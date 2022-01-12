@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_interface);
    model = new com.simplea.jonnylee.calculator.CalModel();
    if ((findViewById(R.id.fragment_container)) != null) {
        if (savedInstanceState != null) {
            return ;
        }
        firstFragment = createFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
        firstFragment.onAttach(this);
    }
    setNumFormatter();
}