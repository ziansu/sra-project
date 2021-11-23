@java.lang.Override
public void onClick(android.view.View v) {
    de.ollosoft.jarvis.common.data.JobExecutionResult response = de.ollosoft.jarvis.common.RequestHandler.sendRequest(mActivity, "j", de.ollosoft.jarvis.common.JobStringFactory.getRadiatorDisableString(java.util.Arrays.asList(rowPos.getName())));
    if ((response.getHttpStatus()) == (org.apache.http.HttpStatus.SC_OK)) {
        radiatorTemp.setText("0°C");
        seeker.setProgress(0);
    }
}