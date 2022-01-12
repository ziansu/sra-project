@java.lang.Override
public java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(final android.content.Intent intent, final int flags) {
    return mCondom.proceedQuery(OutboundType.QUERY_RECEIVERS, intent, new com.oasisfeng.condom.CondomCore.WrappedValueProcedure<java.util.List<android.content.pm.ResolveInfo>>() {
        @java.lang.Override
        public List<android.content.pm.ResolveInfo> proceed(final android.content.Intent intent) {
            return com.oasisfeng.condom.CondomPackageManager.super.queryBroadcastReceivers(intent, flags);
        }
    });
}