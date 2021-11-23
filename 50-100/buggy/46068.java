@java.lang.Override
public void onDestroy() {
    com.example.metrorecord.SqlDatabase dbEntry = new com.example.metrorecord.SqlDatabase(getActivity());
    dbEntry.open();
    android.util.Log.d("database", "Database opened.");
    com.example.metrorecord.SpeedRecord tmp = com.example.metrorecord.MainActivity.map.get(com.example.metrorecord.MainActivity.cur_sr);
    dbEntry.createEntry(tmp.station_info, tmp.halt_or_not, tmp.current_line);
    dbEntry.close();
    android.util.Log.d("save when stop", "save complete");
    new com.example.metrorecord.Logger(tmp.station_info, tmp.halt_or_not, "/sdcard/speed/");
    super.onStop();
}