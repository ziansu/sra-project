@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.Long currMedID = medService.getMedicine(medName).getId();
    java.util.ArrayList<java.lang.Long> remIDs = reminderService.getAllMedReminderIDs(medService.getMedicine(medName).getId());
    cancelAlarm(currMedID, remIDs);
    reminderService.deleteMedReminderByMedId(currMedID);
    medNames.remove(position);
    if (medNames.isEmpty()) {
        medNamesListView.setVisibility(View.INVISIBLE);
    }
    notifyDataSetChanged();
}