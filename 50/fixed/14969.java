public static void postStressMeasurementData(android.content.Context context, org.json.JSONObject object) {
    java.lang.String url = (NetworkConstants.BASE_URL) + (NetworkConstants.POST_PIP_DATA_ENDPOINT);
    new com.wearables.networking.NetworkingTask(url, false, com.wearables.networking.NetworkConstants.METHOD_TYPE.POST, com.wearables.networking.NetworkConstants.REQUEST_TYPE.POST_PIP, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, object);
}