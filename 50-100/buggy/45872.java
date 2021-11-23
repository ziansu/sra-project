private void countup() {
    (counter)++;
    if ((limit) >= (counter)) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                jp.shts.android.keyakifeed.models.eventbus.BusHolder.get().post(new jp.shts.android.keyakifeed.api.MatomeFeedClient.GetMatomeFeedCallback(feedItemList, null));
            }
        });
    }
}