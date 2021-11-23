@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(uw.studybuddy.Events.EventsListRecycleViewFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(uw.studybuddy.Events.EventsListRecycleViewFragment.ARG_PARAM2);
    }
}