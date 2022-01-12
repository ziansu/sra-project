public void initialize(org.apache.cordova.CordovaInterface cordova, org.apache.cordova.CordovaWebView webView) {
    super.initialize(cordova, webView);
    final android.content.Context context = this.cordova.getActivity().getApplicationContext();
    com.gae.scaffolder.plugin.FCMPlugin.gWebView = webView;
    android.util.Log.d(com.gae.scaffolder.plugin.FCMPlugin.TAG, "==> FCMPlugin initialize");
    mFirebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(context);
    com.google.firebase.messaging.FirebaseMessaging.getInstance().subscribeToTopic("android");
    com.google.firebase.messaging.FirebaseMessaging.getInstance().subscribeToTopic("all");
}