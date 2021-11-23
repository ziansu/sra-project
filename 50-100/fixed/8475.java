@android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
@java.lang.Override
public void sendBroadcastAsUser(final android.content.Intent intent, final android.os.UserHandle user, final java.lang.String receiverPermission) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run() {
            com.oasisfeng.condom.CondomContext.super.sendBroadcastAsUser(intent, user, receiverPermission);
        }
    });
}