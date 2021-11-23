@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
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