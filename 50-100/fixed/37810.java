@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.widget.SimpleCursorAdapter adapter = new android.widget.SimpleCursorAdapter(getActivity(), R.layout.row, current, new java.lang.String[]{ DatabaseHelper.TITLE , DatabaseHelper.VALUE }, new int[]{ R.id.title , R.id.value }, 0);
    setListAdapter(adapter);
    if ((current) == null) {
        db = new com.commonsware.android.dbasset.DatabaseHelper(getActivity());
        task = new com.commonsware.android.dbasset.ConstantsFragment.LoadCursorTask().execute();
    }
}