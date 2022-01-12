public java.util.List<com.uf.nomad.mobitrace.database.ActivityTuple> getActivityList(java.lang.String dev_id) {
    android.database.Cursor c = getAllActivityNotSent();
    java.util.List<com.uf.nomad.mobitrace.database.ActivityTuple> actList = new java.util.ArrayList<com.uf.nomad.mobitrace.database.ActivityTuple>();
    c.moveToFirst();
    while (!(c.isAfterLast())) {
        com.uf.nomad.mobitrace.database.ActivityTuple act = cursorToActivity(c);
        act.device_id = dev_id;
        actList.add(act);
        c.moveToNext();
    } 
    return actList;
}