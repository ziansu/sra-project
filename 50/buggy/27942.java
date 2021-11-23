@java.lang.Override
public void onQuickSearchClick(java.lang.String type) {
    com.slavafleer.nearpois.MainActivity.poisFragment.setType(type);
    android.widget.Toast.makeText(this, ("Searched by type: " + type), Toast.LENGTH_SHORT).show();
    android.util.Log.i(com.slavafleer.nearpois.MainActivity.TAG, type);
}