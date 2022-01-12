@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    if ((descriptionText.getText().length()) == 0) {
        commentStatus = createStatus(IStatus.WARNING, org.talend.metadata.managment.ui.i18n.Messages.getString("PropertiesWizardPage.EmptyDescWarning"));
    }else {
        commentStatus = createOkStatus();
    }
    property.setDescription(org.apache.commons.lang.StringUtils.trimToNull(descriptionText.getText()));
    property.setModificationDate(new java.util.Date());
    updatePageStatus();
}