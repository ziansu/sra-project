@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    java.lang.Object parent = getParentFragment();
    if (parent == null)
        parent = activity;
    
    if (!(parent instanceof org.droidplanner.android.dialogs.SupportEditInputDialog.Listener)) {
        throw new java.lang.IllegalStateException(("Parent activity must implement " + (org.droidplanner.android.dialogs.SupportEditInputDialog.Listener.class.getName())));
    }
    mListener = ((org.droidplanner.android.dialogs.SupportEditInputDialog.Listener) (parent));
}