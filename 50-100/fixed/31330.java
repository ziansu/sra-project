@java.lang.Override
protected void onRestart() {
    de.tap.easy_xkcd.fragments.comics.ComicFragment fragment = ((de.tap.easy_xkcd.fragments.comics.ComicFragment) (getSupportFragmentManager().findFragmentByTag(de.tap.easy_xkcd.Activities.MainActivity.BROWSER_TAG)));
    if (((fragment != null) && (prefHelper.isOnline(this))) && (!(de.tap.easy_xkcd.Activities.MainActivity.fromSearch)))
        if ((de.tap.easy_xkcd.Activities.MainActivity.fullOffline) || ((prefHelper.isWifi(this)) || (prefHelper.mobileEnabled())))
            fragment.updatePager();
        
    
    if (de.tap.easy_xkcd.Activities.MainActivity.fromSearch)
        de.tap.easy_xkcd.Activities.MainActivity.fromSearch = false;
    
    super.onRestart();
}