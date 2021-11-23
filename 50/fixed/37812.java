@android.annotation.TargetApi(value = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
private void selectItem(final int position) {
    mDrawerLayout.closeDrawer(mDrawerList);
    onPostClosed(position);
}