@java.lang.Override
public void sendOrderedBroadcast(final android.content.Intent intent, final java.lang.String receiverPermission, final android.content.BroadcastReceiver resultReceiver, final android.os.Handler scheduler, final int initialCode, final java.lang.String initialData, final android.os.Bundle initialExtras) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run(final android.content.Intent intent) {
            com.oasisfeng.condom.CondomContext.super.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler, initialCode, initialData, initialExtras);
        }
    });
}