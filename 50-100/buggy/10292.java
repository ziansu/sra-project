@java.lang.Override
public void onBackPressed() {
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }else
        if ((pageHistory.size()) > 0) {
            saveToHistory = false;
            viewPager.setCurrentItem(pageHistory.pop().intValue());
            saveToHistory = true;
        }else
            if (pageHistory.empty()) {
                super.onBackPressed();
            }
        
    
}