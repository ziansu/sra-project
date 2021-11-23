@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle bundle = getArguments();
    mContext = getActivity();
    mBodyPartsArray = getResources().getStringArray(R.array.bodyparts);
    mEquipmentArray = getResources().getStringArray(R.array.equipment);
    mDatabase = com.google.firebase.database.FirebaseDatabase.getInstance().getReference();
    mUserId = bundle.getString(com.zonesciences.pyrros.fragment.CreateWorkout.CreateWorkoutFragment.ARG_USER_ID);
    mUsername = bundle.getString(com.zonesciences.pyrros.fragment.CreateWorkout.CreateWorkoutFragment.ARG_USER_NAME);
    setHasOptionsMenu(true);
}