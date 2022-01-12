@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    android.app.AlarmManager am = ((android.app.AlarmManager) (getSystemService(Context.ALARM_SERVICE)));
    if ((tasks.get(i).getPendingIntent()) != null) {
        am.cancel(tasks.get(i).getPendingIntent());
    }
    tasks.remove(i);
    toast.show();
    taskListAdapter.notifyDataSetChanged();
}