public void bindGuardService() {
    com.squareup.leakcanary.CanaryLog.d("AssistiveResultService bindGuardService");
    android.content.Intent intent = new android.content.Intent(this, com.squareup.leakcanary.assistivetouch.AssistiveGuardService.class);
    intent.putExtra(AssistiveGuardService.BIND_KEY, AssistiveGuardService.BIND_ASSISTIVE_RESULT_SERVICE);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
    isBind = true;
}