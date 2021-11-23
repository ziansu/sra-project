@com.squareup.otto.Subscribe
public void onInitProgressed(com.iskrembilen.quasseldroid.events.InitProgressEvent event) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.Fragment currentFragment = fm.findFragmentById(R.id.main_content_container);
    if (event.done) {
        manager.initMainFragment();
        loadBufferAndDrawerState();
        manager.hideKeyboard();
        setTitleAndMenu();
    }else
        if (currentFragment == null) {
            android.util.Log.d(com.iskrembilen.quasseldroid.gui.MainActivity.TAG, "Showing progress");
            showInitProgress();
        }
    
}