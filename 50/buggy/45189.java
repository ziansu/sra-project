@java.lang.Override
public void onPause() {
    super.onPause();
    selectedTabPosition = tabLayout.getSelectedTabPosition();
    android.util.Log.d("TabId: ", java.lang.String.valueOf(selectedTabPosition));
}