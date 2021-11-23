@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    syncUtils = new ee.ttu.schedule.utils.SyncUtils(getActivity());
    colorArray = getResources().getStringArray(R.array.colors);
    setHasOptionsMenu(true);
    getLoaderManager().restartLoader(0, null, this);
}