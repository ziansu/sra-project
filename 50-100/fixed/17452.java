@java.lang.Override
public void onReceiveAPIResult(java.util.Map<java.lang.String, java.lang.String> result, int requestCode) {
    if ((requestCode == (org.wso2.emm.agent.utils.Constants.GCM_REGISTRATION_ID_SEND_CODE)) && (result != null)) {
        java.lang.String status = result.get(Constants.STATUS_KEY);
        if (!(Constants.Status.SUCCESSFUL.equals(status))) {
            clearData(getContext());
            displayConnectionError();
        }
    }
}