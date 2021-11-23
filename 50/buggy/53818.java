public void onEvent(java.lang.Object event) {
    android.util.Log.w("onEvent", (" " + event));
    if (event instanceof org.tribler.android.restapi.json.EventsStartEvent) {
        runOnUiThread(() -> {
            progressBar.setVisibility(View.GONE);
        });
    }
}