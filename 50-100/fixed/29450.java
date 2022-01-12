@java.lang.Override
public void onCocktailDetailSelected() {
    if (((cocktailPager) != null) && (cocktailPager.isAdded())) {
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.Fragment frg = fm.findFragmentByTag(com.igotsomeapps.cheatsheet.MainActivity.FRAGMENT_COCKTAIL);
        fm.beginTransaction().remove(frg).commit();
        fm.popBackStack();
        mVibrator.vibrate(getResources().getInteger(R.integer.clickVibeTime));
        cocktailPager = null;
    }
}