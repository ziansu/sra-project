static void requestPermissions(android.content.Context context, net.kjulio.rxlocation.BaseHelper baseHelper) {
    net.kjulio.rxlocation.PermissionsRequestLock.getInstance().addListener(baseHelper);
    if (!(net.kjulio.rxlocation.PermissionsActivity.permissionsRequestInprogress)) {
        android.content.Intent intent = new android.content.Intent(context, net.kjulio.rxlocation.PermissionsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}