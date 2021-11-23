@java.lang.Override
public void onAuthSuccessful(com.onaio.steps.helper.AuthDialog authDialog) {
    authDialog.dismiss();
    android.widget.LinearLayout settingsLayout = ((android.widget.LinearLayout) (activity.findViewById(R.id.settings)));
    settingsLayout.setVisibility(View.VISIBLE);
    getFlow(flowType).prepareSettingScreen();
}