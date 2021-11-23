public static com.example.root.myalarmclock.Alarm getSoonestAlarm() {
    if (((com.example.root.myalarmclock.MainActivity.mAlarmList) != null) && (!(com.example.root.myalarmclock.MainActivity.mAlarmList.isEmpty())))
        return com.example.root.myalarmclock.MainActivity.mAlarmList.get(0);
    else
        return null;
    
}