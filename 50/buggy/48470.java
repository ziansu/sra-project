@java.lang.Override
public void onPause() {
    super.onPause();
    android.content.SharedPreferences.Editor editor = getPreferences(com.appfactory.quinn.m3ustreamtest2.MODE_PRIVATE).edit();
    editor.putInt("Last Channel", mCurrentIndex);
    editor.commit();
}