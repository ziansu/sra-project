@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    java.lang.System.out.println("----- ConnectionManager.Sync#doInBackground: Sync in progress");
    if (App.PERFORM_UPDATE) {
        App.PERFORM_UPDATE = false;
        App.conLis.mysql_update();
    }
    for (int i = 0; i < (entry.size());) {
        if (entry.get(i).mysql_update()) {
            ++i;
        }
    }
    syncTask = new fry.oldschool.utils.ConnectionManager.Sync();
    return null;
}