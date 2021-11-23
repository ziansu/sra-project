public static void increaseHuntNumber(android.content.Context context) {
    int huntNumber = com.kappa_labs.ohunter.client.utilities.SharedDataManager.getHuntNumber(context);
    com.kappa_labs.ohunter.client.utilities.SharedDataManager.getSharedPreferences(context).edit().putInt(com.kappa_labs.ohunter.client.utilities.SharedDataManager.HUNT_NUMBER_KEY, (huntNumber + 1)).commit();
}