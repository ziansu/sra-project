@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setHasOptionsMenu(true);
    setRetainInstance(true);
    db = new com.commonsware.android.constants.DatabaseHelper(getActivity());
    task = new com.commonsware.android.constants.ConstantsFragment.LoadCursorTask(getActivity().getApplicationContext()).execute();
}