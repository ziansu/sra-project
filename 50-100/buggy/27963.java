public void showBottomBar() {
    if ((activeFragment) == null) {
        return ;
    }
    android.util.Log.e(rs.ftn.pma.tourismobile.activities.MainActivity.TAG, ("show in main bb: " + ((activeFragment) instanceof rs.ftn.pma.tourismobile.util.IBottomBarView)));
    android.util.Log.e(rs.ftn.pma.tourismobile.activities.MainActivity.TAG, activeFragment.toString());
    if ((activeFragment) instanceof rs.ftn.pma.tourismobile.util.IBottomBarView) {
        selectionPreference.selectedItemIDs().remove();
        bottomBarShowing = ((rs.ftn.pma.tourismobile.util.IBottomBarView) (activeFragment)).showBottomBar();
    }
}