public java.util.List<com.uf.nomad.mobitrace.database.ActivityTuple> getActivityList() {
    android.database.Cursor c = getAllActivityNotSent();
    java.util.List<com.uf.nomad.mobitrace.database.ActivityTuple> actList = new java.util.ArrayList<>();
    c.moveToFirst();
    while (!(c.isAfterLast())) {
        com.uf.nomad.mobitrace.database.ActivityTuple act = cursorToActivity(c);
        actList.add(act);
        c.moveToNext();
    } 
    return actList;
}