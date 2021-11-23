@android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
@java.lang.Override
public void sendStickyOrderedBroadcastAsUser(final android.content.Intent intent, final android.os.UserHandle user, final android.content.BroadcastReceiver resultReceiver, final android.os.Handler scheduler, final int initialCode, final java.lang.String initialData, final android.os.Bundle initialExtras) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run() {
            com.oasisfeng.condom.CondomContext.super.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler, initialCode, initialData, initialExtras);
        }
    });
}