@android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
@java.lang.Override
public void sendOrderedBroadcastAsUser(final android.content.Intent intent, final android.os.UserHandle user, final java.lang.String receiverPermission, final android.content.BroadcastReceiver resultReceiver, final android.os.Handler scheduler, final int initialCode, final java.lang.String initialData, final android.os.Bundle initialExtras) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run(final android.content.Intent intent) {
            com.oasisfeng.condom.CondomContext.super.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver, scheduler, initialCode, initialData, initialExtras);
        }
    });
}