@java.lang.Override
protected void onResume() {
    super.onResume();
    if (!(com.android.internal.util.cm.ScreenType.isTablet(this))) {
        getListView().setPadding(0, 0, 0, 0);
    }
}