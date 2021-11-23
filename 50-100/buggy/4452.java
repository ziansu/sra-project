public static void setAllNotifications(android.content.Context ctx) {
    int[] map = za.co.twinc.everydayhabit.MainActivity.loadHabitMap(ctx);
    int i = 0;
    if ((za.co.twinc.everydayhabit.MainActivity.alarmReceiver) == null)
        za.co.twinc.everydayhabit.MainActivity.alarmReceiver = new za.co.twinc.everydayhabit.AlarmReceiver();
    
    while (i < (map.length)) {
        za.co.twinc.everydayhabit.MainActivity.setHabitNotification(ctx, map[i]);
        i++;
    } 
    za.co.twinc.everydayhabit.MainActivity.alarmReceiver.setBootReceiver(ctx);
}