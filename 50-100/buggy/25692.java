public static void startInAppFlowInApp(android.app.Activity activity, com.enstage.wibmo.sdk.inapp.pojo.W2faInitRequest w2faInitRequest, com.enstage.wibmo.sdk.inapp.pojo.W2faInitResponse w2faInitResponse) {
    android.content.Intent intent = new android.content.Intent(((com.enstage.wibmo.sdk.WibmoSDK.getWibmoIntentActionPackage()) + ".InApp"));
    intent.addCategory(Intent.CATEGORY_DEFAULT);
    intent.putExtra("W2faInitRequest", w2faInitRequest);
    intent.putExtra("W2faInitResponse", w2faInitResponse);
    if ((com.enstage.wibmo.sdk.inapp.InAppInitActivity.readyPackage) != null) {
        intent.setPackage(com.enstage.wibmo.sdk.inapp.InAppInitActivity.readyPackage);
    }
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    activity.startActivityForResult(intent, WibmoSDK.REQUEST_CODE_IAP_2FA);
}