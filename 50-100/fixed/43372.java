@java.lang.Override
public void onSaveInstanceState(final android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString("taskType", mTaskType);
    outState.putSerializable("startDate", mQueryStartDate);
    outState.putSerializable("endDate", mQueryEndDate);
    java.util.List<org.vai.vari.bsiandroid.ReqTaskItem> tasks = mAdapter.getTasks();
    outState.putSerializable("tasks", new java.util.ArrayList(tasks));
}