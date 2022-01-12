@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        com.plorial.exoroplayer.views.FileExplorerFragment fileExplorerFragment = new com.plorial.exoroplayer.views.FileExplorerFragment();
        android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container, fileExplorerFragment);
        transaction.addToBackStack(FileExplorerFragment.CLASS_NAME);
        transaction.commit();
    }
}