@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putLong(com.jdelorenzo.capstoneproject.EditDayFragment.ARG_ROUTINE_ID, mRoutineId);
    mAdapter.onSaveInstanceState(outState);
    super.onSaveInstanceState(outState);
}