@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    currentMenu = ((com.teinproductions.tein.integerfactorization.SmartCalcMenu) (currentMenu.getParent()));
    setTitle(currentMenu.getName());
    if ((currentMenu) == (root)) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        setTitle(R.string.app_name);
    }
}