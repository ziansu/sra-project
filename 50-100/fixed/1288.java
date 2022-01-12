@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d("bag", "url1");
    liverand = "user-" + (rand);
    com.tom.cococar.StopTask stop = new com.tom.cococar.StopTask();
    stop.executeOnExecutor(com.tom.cococar.MapsActivity.THREAD_POOL_EXECUTOR, liverand);
    rand = java.util.UUID.randomUUID().toString();
}