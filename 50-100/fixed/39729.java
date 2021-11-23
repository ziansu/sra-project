public void addNumber(final java.lang.String cNumber) {
    if (cNumber.equals(""))
        return ;
    
    android.support.v4.app.Fragment fragment = null;
    if (wideScreen) {
        fragment = getSupportFragmentManager().findFragmentById(R.id.marksFrame);
    }else {
        fragment = org.vimteam.marshalone.activity.RaceUtility.getFragmentFromTabs(this, org.vimteam.marshalone.activity.RaceResultsFragment.class, R.id.marksTabs);
    }
    if (fragment != null) {
        ((org.vimteam.marshalone.activity.RaceResultsFragment) (fragment)).addNumber(cNumber);
    }
}