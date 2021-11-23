@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    com.mcssoft.racemeetings2.database.DatabaseOperations dbOper = new com.mcssoft.racemeetings2.database.DatabaseOperations(getActivity());
    cursor = dbOper.getAllFromTable(SchemaConstants.MEETINGS_TABLE);
    setMeetingAdapter();
    if (!(isEmptyView)) {
        setRecyclerView(rootView);
    }
}