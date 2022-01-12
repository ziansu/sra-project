@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(activity, com.phonemap.phonemap.TaskDescription.class);
    com.phonemap.phonemap.objects.Task task = tasks.get(position);
    android.util.Log.i("TEST", task.getName());
    intent.putExtra(com.phonemap.phonemap.constants.Other.TASK, tasks.get(position));
    activity.startActivity(intent);
}