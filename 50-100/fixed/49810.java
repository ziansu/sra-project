@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.i("Removing", ("Reminder " + position));
    activeReminder.completed.remove(position);
    com.androidandyuk.regularreminders.MainActivity.saveCompletedToGoogle(com.androidandyuk.regularreminders.MainActivity.activeReminder);
    java.util.Collections.sort(activeReminder.completed, new com.androidandyuk.regularreminders.StringDateComparator());
    com.androidandyuk.regularreminders.AddReminderItem.myAdapter.notifyDataSetChanged();
    android.support.design.widget.Snackbar.make(findViewById(R.id.main), "Deleted!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
}