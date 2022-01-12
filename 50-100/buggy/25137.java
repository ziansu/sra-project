public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            curFragment = 2;
            android.app.FragmentManager fm = getFragmentManager();
            if ((fm.getBackStackEntryCount()) > 0) {
                fm.popBackStack();
            }
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}