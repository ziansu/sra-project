@java.lang.Override
public void onAuthSuccessful(com.onaio.steps.helper.AuthDialog authDialog) {
    authDialog.dismiss();
    this.onAuthSuccessful(flowType);
}