public adminportal.ConsumerDetailsPage verifySMSValue(adminportal.enums.ConsumerDetailsColumn field, java.lang.String message, java.lang.String value, boolean present) {
    adminportal.Actions.scrollToBottom(common.AdminPortalBrowser.Instance());
    adminportal.Assertions.verifyText(common.AdminPortalBrowser.Instance(), adminportal.ConsumerDetailsPage.targetField(ConsumerDetailsTable.SMS, ConsumerDetailsColumn.SMS_MESSAGE, field, message), "text", value, false, present);
    return this;
}