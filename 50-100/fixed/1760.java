@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        com.example.vincent.lab1.fragment.ListeFragment listeFragment = new com.example.vincent.lab1.fragment.ListeFragment();
        com.example.vincent.lab1.fragment.PlaceHolderFragment mapFragment = new com.example.vincent.lab1.fragment.PlaceHolderFragment();
        fragmentTransaction.add(R.id.liste_fragment_container, listeFragment);
        fragmentTransaction.add(R.id.map_fragment_container, mapFragment);
        fragmentTransaction.commit();
    }
}