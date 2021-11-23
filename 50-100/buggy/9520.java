@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putLong(org.tasks.ui.GoogleTaskListFragment.EXTRA_TASK_ID, taskId);
    outState.putParcelable(org.tasks.ui.GoogleTaskListFragment.EXTRA_ORIGINAL_LIST, originalList.getStoreObject());
    outState.putParcelable(org.tasks.ui.GoogleTaskListFragment.EXTRA_SELECTED_LIST, selectedList.getStoreObject());
}