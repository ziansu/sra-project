@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if ((currentMenu) != (root)) {
        currentMenu = ((com.teinproductions.tein.integerfactorization.SmartCalcMenu) (currentMenu.getParent()));
        if ((currentMenu) == (root)) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            setTitle(R.string.app_name);
        }else {
            setTitle(currentMenu.getName());
        }
    }
}