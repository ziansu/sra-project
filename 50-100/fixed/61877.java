public void moveWatchfaceOrder(int from, int to) {
    if (to >= (sortIndex.size()))
        return ;
    
    android.util.Log.w(getPackageName(), ((("Sorting: moving " + from) + " to ") + to));
    java.lang.String uuid = sortIndex.get(from);
    sortIndex.remove(from);
    sortIndex.add(to, uuid);
    saveAutoUuids();
    refreshWatchfaces();
}