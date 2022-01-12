@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    try {
        mListener = ((com.ipaulpro.afilechooser.FileListFragment.Callbacks) (context));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((context.toString()) + " must implement FileListFragment.Callbacks"));
    }
}