@Test(enabled = false, groups = { "scenario" , "loop" , "templates" , "invitations" , "branded messaging" })
public void bmCanVerifyNewImagePresentInEnrollCustomerPreviewBody() {
    BrandedMessagingTests.setupTemplate();
    clientportal.WireMessageEditorPage.Goto().setCheckboxField(WireMessageEditorCheckboxField.MAKE_TEMPLATE_AVAILABLE_IN_ENROLL_CUSTOMER, true).setCheckboxField(WireMessageEditorCheckboxField.ADD_IMAGE, true).setDropDownValue(WireMessageEditorDropDownField.IMAGE, BrandedMessagingTests.imageID).clickSaveAndActivateLink();
    clientportal.EnrollCustomerPage.Goto().selectTemplate(BrandedMessagingTests.templateName).verifyPreviewImage(BrandedMessagingTests.imageID, true).selectTemplate(BrandedMessagingTests.templateName).verifyPreviewImage(BrandedMessagingTests.imageID, false);
}