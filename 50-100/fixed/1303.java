private void unregister(java.lang.Object object) {
    if (receiverMap.containsKey(object)) {
        java.util.Map<java.lang.String, android.content.BroadcastReceiver> map = receiverMap.get(object);
        for (android.content.BroadcastReceiver receiver : map.values()) {
            try {
                com.liangmayong.airing.Airing.getApplication().unregisterReceiver(receiver);
            } catch (java.lang.Exception e) {
            }
        }
        receiverMap.remove(object);
    }
}