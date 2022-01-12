public static void startInAppReadinessCheck(android.app.Activity activity) {
    android.util.Log.d(com.enstage.wibmo.sdk.inapp.InAppInitActivity.TAG, "startInAppReadinessCheck");
    java.lang.String targetAppPackage = com.enstage.wibmo.sdk.WibmoSDK.getWibmoIntentActionPackage();
    android.content.Intent intent = new android.content.Intent((targetAppPackage + ".ReadinessChecker"));
    intent.addCategory(Intent.CATEGORY_DEFAULT);
    if ((com.enstage.wibmo.sdk.WibmoSDK.getWibmoAppPackage()) != null) {
        intent.setPackage(com.enstage.wibmo.sdk.WibmoSDK.getWibmoAppPackage());
    }
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    activity.startActivityForResult(intent, com.enstage.wibmo.sdk.inapp.InAppInitActivity.REQUEST_CODE_IAP_READY);
}