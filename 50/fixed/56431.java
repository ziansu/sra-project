public void onClick(android.content.DialogInterface dialog, int which) {
    databaseHandler.deleteReminder(specifiedReminders.get(listPos));
    specifiedReminders.remove(listPos);
    timeOnlyReminders.remove(listPos);
    eventListAdapter.notifyDataSetChanged();
}