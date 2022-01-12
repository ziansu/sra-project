@java.lang.Override
public void onClick(android.view.View view) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        getInternetPermission();
    }
    try {
        if ((view.getId()) == (R.id.connect_button)) {
            if (!(sxccal.edu.android.remouse.ConnectionFragment.sActiveConnection)) {
                startClientConnectionThread();
                sxccal.edu.android.remouse.ConnectionFragment.sActiveConnection = true;
            }
        }else
            if ((view.getId()) == (R.id.discover_button)) {
            }
        
    } catch (java.lang.RuntimeException e) {
        e.printStackTrace();
    }
}