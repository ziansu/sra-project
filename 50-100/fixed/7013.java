@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_select_training_plan);
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    com.race.planner.fragments.SelectNameFragment selectNameFragment = new com.race.planner.fragments.SelectNameFragment();
    java.lang.String tag = selectNameFragment.toString();
    fragmentTransaction.replace(R.id.fragment_swap, selectNameFragment, tag);
    fragmentTransaction.commit();
}