@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        me.ccrama.redditslide.Reddit.mHelper.startSetup(new me.ccrama.redditslide.util.IabHelper.OnIabSetupFinishedListener() {
            public void onIabSetupFinished(me.ccrama.redditslide.util.IabResult result) {
                if (!(result.isSuccess())) {
                    android.util.Log.d("Slide", ("Problem setting up In-app Billing: " + result));
                }
            }
        });
    } catch (java.lang.Exception ignored) {
    }
    return null;
}