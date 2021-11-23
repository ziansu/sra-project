@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    syncUtils = new ee.ttu.schedule.utils.SyncUtils(getActivity());
    colorArray = getResources().getStringArray(R.array.colors);
    if ((getArguments()) != null)
        setTypeView(getArguments().getInt(ee.ttu.schedule.fragment.ScheduleFragment.ARG_TYPE, ee.ttu.schedule.fragment.ScheduleFragment.TYPE_DAY_VIEW));
    
    setHasOptionsMenu(true);
    getLoaderManager().restartLoader(0, null, this);
}