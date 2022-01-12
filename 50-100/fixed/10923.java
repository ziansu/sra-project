public void remove(java.lang.String[] parm) {
    java.lang.String nId = parm[0];
    org.zywx.wbpalmstar.plugin.uexLocalNotification.EAlarmReceiver.cancelAlerm(mContext, nId);
    if (((org.zywx.wbpalmstar.plugin.uexLocalNotification.EUexLocalNotify.map) != null) && (org.zywx.wbpalmstar.plugin.uexLocalNotification.EUexLocalNotify.map.containsKey(nId))) {
        int id = org.zywx.wbpalmstar.plugin.uexLocalNotification.EUexLocalNotify.map.get(nId);
        org.zywx.wbpalmstar.plugin.uexLocalNotification.EUexLocalNotify.map.remove(nId);
        if ((notificationManager) != null) {
            notificationManager.cancel(id);
        }
    }
}