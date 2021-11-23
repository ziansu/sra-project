public void onClick(android.content.DialogInterface dialog, int which) {
    databaseHandler.deleteReminder(specifiedReminders.get(listPos));
    timeOnlyReminders.remove(listPos);
    eventListAdapter.notifyDataSetChanged();
}