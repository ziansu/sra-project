@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (R.id.connect_button)) {
        if (!(sxccal.edu.android.remouse.ConnectionFragment.sActiveConnection)) {
            startClientConnectionThread();
            sxccal.edu.android.remouse.ConnectionFragment.sActiveConnection = true;
        }
    }else
        if ((view.getId()) == (R.id.discover_button)) {
        }
    
}