@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.util.Calendar nextExecute = java.util.Calendar.getInstance();
    nextExecute.add(java.util.Calendar.MINUTE, java.lang.Integer.parseInt(input.getText().toString()));
    schedule.setNextExecute(nextExecute);
    scheduleHelper.update(schedule);
}