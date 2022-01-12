@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    if ((fragManager.findFragmentById(android.R.id.content)) == null) {
        copy_pasta.admin.asciicopypasta.MemeListFragment memeFragment = new copy_pasta.admin.asciicopypasta.MemeListFragment();
        fragManager.beginTransaction().addToBackStack(null).replace(android.R.id.content, memeFragment).commit();
    }
}