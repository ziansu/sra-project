@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    com.example.tony.shortstories.StoryFragment storyFragment = new com.example.tony.shortstories.StoryFragment();
    fragmentTransaction.add(R.id.fragment_container, storyFragment);
    fragmentTransaction.commit();
}