@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new_list);
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    com.wesleyreisz.mymusic.fragment.NewListActivityFragment listFragment = new com.wesleyreisz.mymusic.fragment.NewListActivityFragment();
    fragmentTransaction.replace(R.id.fragmentContainer, listFragment);
    fragmentTransaction.commit();
}