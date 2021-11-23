@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mListener = ((com.ipaulpro.afilechooser.FileListFragment.Callbacks) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((activity.toString()) + " must implement FileListFragment.Callbacks"));
    }
}