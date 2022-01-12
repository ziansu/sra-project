@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mRoutineId = savedInstanceState.getLong(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_WORKOUT_ID);
    mCheckedDays = savedInstanceState.getBooleanArray(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_CHECKED_DAYS);
}