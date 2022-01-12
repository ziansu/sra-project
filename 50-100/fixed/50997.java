private void removeAlarmsOfDatabase() {
    com.google.firebase.database.DatabaseReference alarmRef = database.getReference(("User_" + (userID)));
    alarmRef.removeValue();
    for (int i = 0; i < (alarms.size()); i++) {
        alarms.remove(i);
    }
    adapterAlarm.notifyDataSetChanged();
}