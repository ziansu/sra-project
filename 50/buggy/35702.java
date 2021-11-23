public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    reviewRequest.setTargetPeople(java.util.Collections.singletonList(toUserText.getText()));
    getContainer().updateButtons();
}