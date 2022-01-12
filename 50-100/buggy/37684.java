@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    longPressDetector = new android.view.GestureDetector(this, new de.teamawesome.awesomeplayer.MainMenuActivity.TouchProcessor());
    setContentView(R.layout.activity_main_menu);
    android.app.Fragment initialFragment = new de.teamawesome.awesomeplayer.fragments.InitialSelectionFragment();
    android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.add(R.id.MainContainer, initialFragment, de.teamawesome.awesomeplayer.MainMenuActivity.MAIN_FRAGMENT_TAG);
    transaction.commit();
}