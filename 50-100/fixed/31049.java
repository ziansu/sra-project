public static java.lang.Long getStartTime(android.content.Context context) {
    if ((com.kappa_labs.ohunter.client.SharedDataManager.startTime) == null) {
        com.kappa_labs.ohunter.client.SharedDataManager.startTime = com.kappa_labs.ohunter.client.SharedDataManager.getSharedPreferences(context).getLong(com.kappa_labs.ohunter.client.SharedDataManager.START_TIME_KEY, 0);
        if ((com.kappa_labs.ohunter.client.SharedDataManager.startTime) <= 0) {
            com.kappa_labs.ohunter.client.SharedDataManager.startTime = null;
        }
    }
    return com.kappa_labs.ohunter.client.SharedDataManager.startTime;
}