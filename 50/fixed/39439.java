public void reloadSentMessages() {
    android.support.v4.app.Fragment fragment = pageAdapter.getRegisteredFragment(2);
    if (fragment != null)
        ((au.com.wallaceit.reddinator.ui.AccountFeedFragment) (fragment)).reload();
    
}