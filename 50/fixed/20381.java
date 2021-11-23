@java.lang.Override
public void onFailure(java.lang.Throwable caught) {
    ua.nure.ostpc.malibu.shedule.client.LoadingPanel.stop();
    errorLabel.setText(caught.getMessage());
    getEditButton().setEnabled(true);
    getEditButton().setFocus(false);
}