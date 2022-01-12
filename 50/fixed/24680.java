@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    try {
        mCallbacks = ((org.onebusaway.android.ui.NavigationDrawerFragment.NavigationDrawerCallbacks) (context));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException("Activity must implement NavigationDrawerCallbacks.");
    }
}