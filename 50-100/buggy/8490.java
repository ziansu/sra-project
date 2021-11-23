public static void init(android.content.Context context) {
    com.android.contacts.incall.InCallPluginHelper helper = com.android.contacts.incall.InCallPluginHelper.getInstance();
    helper.expectedCallbacks = com.android.contacts.incall.InCallPluginHelper.EXPECTED_CALL_BACKS;
    helper.mContext = context;
    helper.mClient = AmbientConnection.CLIENT.get(context);
    helper.mInCallApi = com.cyanogen.ambient.incall.InCallServices.getInstance();
    helper.mMainHandler = new android.os.Handler(context.getMainLooper());
    com.android.contacts.incall.InCallPluginHelper.refresh();
}