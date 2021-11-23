private void removeAlarmsOfDatabase() {
    com.google.firebase.database.DatabaseReference alarmRef = database.getReference(("User_" + (userID)));
    alarmRef.removeValue();
    for (xavi.smartalarm.Alarm a : alarms) {
        alarms.remove(a);
    }
    adapterAlarm.notifyDataSetChanged();
}