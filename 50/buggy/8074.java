public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    reviewRequest.setSummary(summary.getText());
    getContainer().updateButtons();
}