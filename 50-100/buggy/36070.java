private void checkLogin(org.json.JSONObject subjectKey, final com.janrain.android.logineligibility.LEService.LoginEligibilityResultHandler handler) {
    com.janrain.android.logineligibility.PolicyCheckerTaskParams taskParams = new com.janrain.android.logineligibility.PolicyCheckerTaskParams(com.janrain.android.logineligibility.LEService.state.leServiceConfiguration, subjectKey);
    com.janrain.android.logineligibility.PolicyCheckerTask task = new com.janrain.android.logineligibility.PolicyCheckerTask();
    task.init(taskParams, new com.janrain.android.logineligibility.PolicyCheckerTask.PolicyCheckerTaskCompleted() {
        @java.lang.Override
        public void onPolicyCheckerTaskCompleted(org.json.JSONObject response) {
            if (response.has("errorCode")) {
                handler.onLEServiceFailure(response);
            }else {
                handler.onLEServiceSuccess(response);
            }
        }
    });
    task.execute();
}