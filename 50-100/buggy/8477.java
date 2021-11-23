@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d("onCreate", "onCreate starting");
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(uw.studybuddy.Events.EventsListRecycleViewFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(uw.studybuddy.Events.EventsListRecycleViewFragment.ARG_PARAM2);
    }
    android.util.Log.d("onCreate", "onCreate ended");
    mDatabase = com.google.firebase.database.FirebaseDatabase.getInstance().getReference().child("EventInfo");
}