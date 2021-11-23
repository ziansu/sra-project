@java.lang.Override
public void onQuickSearchClick(java.lang.String type) {
    com.slavafleer.nearpois.MainActivity.poisFragment.setType(type);
    android.util.Log.i(com.slavafleer.nearpois.MainActivity.TAG, type);
}