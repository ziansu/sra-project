static void resolveError(android.content.Context context, net.kjulio.rxlocation.BaseHelper baseHelper, com.google.android.gms.common.ConnectionResult connectionResult) {
    net.kjulio.rxlocation.ErrorResolutionLock.getInstance().addListener(baseHelper);
    if (!(net.kjulio.rxlocation.ErrorResolutionActivity.errorResolutionInProgress)) {
        android.content.Intent intent = new android.content.Intent(context, net.kjulio.rxlocation.ErrorResolutionActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(net.kjulio.rxlocation.ErrorResolutionActivity.EXTRA_CONNECTION_RESULT, connectionResult);
        context.startActivity(intent);
    }
}