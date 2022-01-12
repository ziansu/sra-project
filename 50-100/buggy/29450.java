@java.lang.Override
public void onCocktailDetailSelected() {
    if (((cocktailPager) != null) && (cocktailPager.isAdded())) {
        android.util.Log.e("GAF", "Removing...");
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.Fragment frg = fm.findFragmentByTag(com.igotsomeapps.cheatsheet.MainActivity.FRAGMENT_COCKTAIL);
        getSupportFragmentManager().beginTransaction().remove(frg).commit();
        fm.popBackStack();
        android.util.Log.e("GAF", "Removed.");
        mVibrator.vibrate(getResources().getInteger(R.integer.clickVibeTime));
    }
}