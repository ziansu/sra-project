@java.lang.Override
public boolean showBottomBar() {
    android.util.Log.e(rs.ftn.pma.tourismobile.fragments.TagsFragment.TAG, ((("show bb: " + (firstTimeLoading)) + " - ") + (defaults)));
    if (!(defaults)) {
        bottomBar.show();
        return true;
    }
    return false;
}