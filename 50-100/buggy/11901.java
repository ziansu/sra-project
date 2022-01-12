@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent scheduleDetailIntent = new android.content.Intent(jContext, com.android.activelife.tampa.ui.ScheduleContainerActivity.class);
    scheduleDetailIntent.putExtra("schedule_id", mMessagesDataResponseList.get(position).getSchedule().getId());
    scheduleDetailIntent.putExtra("schedule_name", mMessagesDataResponseList.get(position).getSchedule().getName());
    jContext.startActivity(scheduleDetailIntent);
}