@java.lang.Override
public void onClick(int position) {
    int taskId = tasks.get(position).getId();
    android.content.Intent intent = new android.content.Intent(getActivity(), com.android.example.todoer.activity.EditorActivity.class);
    intent.putExtra(EditorActivity.EXTRA_TASK_ID, taskId);
    startActivity(intent);
}