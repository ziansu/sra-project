@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.dhchoi.crowdsourcingapp.task.Task task = ((com.dhchoi.crowdsourcingapp.task.Task) (parent.getItemAtPosition(position)));
    android.util.Log.d(Constants.TAG, ("clicked task: " + task));
    android.content.Intent intent = new android.content.Intent(getActivity(), com.dhchoi.crowdsourcingapp.activities.TaskCompleteActivity.class);
    intent.putExtra(Task.TASK_KEY_SERIALIZABLE, task);
    startActivity(intent);
}