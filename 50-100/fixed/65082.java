@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.replace(R.id.activity_main, new com.brolaugh.bard.fragment.MainMenuFragment());
    transaction.commit();
}