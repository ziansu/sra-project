@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    if ((Utils.UserId.isEmpty()) || (Utils.TargetId.isEmpty())) {
        updateDisplay();
    }else
        if (intent.getAction().equals("android.intent.action.MAIN")) {
            checkPushService();
            push();
        }
    
}