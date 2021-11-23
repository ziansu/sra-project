public static void getAndPostWithingsData(android.content.Context context) {
    java.lang.String url = NetworkConstants.WITHINGS_URL_DATA;
    new com.wearables.networking.NetworkingTask(url, true, com.wearables.networking.NetworkConstants.METHOD_TYPE.GET, com.wearables.networking.NetworkConstants.REQUEST_TYPE.WITHINGS_DATA_ACCESS, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
}