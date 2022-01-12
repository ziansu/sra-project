public static void removeNotification(int i) {
    new se.uu.csproject.monadclient.serverinteractions.RemoveNotificationTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, se.uu.csproject.monadclient.storage.Storage.notifications.get(i).getID());
    se.uu.csproject.monadclient.storage.Storage.notifications.remove(i);
}