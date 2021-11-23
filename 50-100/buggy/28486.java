@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.content.Intent intent;
    android.support.v4.app.Fragment current = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);
    switch (item.getItemId()) {
        case R.id.ml_menu_open_mrl :
            onOpenMRL();
            break;
        case android.R.id.home :
            if (slideDownAudioPlayer())
                break;
            
            if (secondaryFragments.contains(mCurrentFragment)) {
                popSecondaryFragment();
                break;
            }
            if (mDrawerToggle.onOptionsItemSelected(item)) {
                return true;
            }
            break;
    }
    return super.onOptionsItemSelected(item);
}