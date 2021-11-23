public void sendSMSAndEmailToApplicantForLettertoparty(final org.egov.bpa.application.entity.BpaApplication bpaApplication) {
    if ((isSmsEnabled()) || (isEmailEnabled())) {
        buildSmsAndEmailForBPANewAppln(bpaApplication, bpaApplication.getOwner().getUser().getName(), bpaApplication.getOwner().getUser().getMobileNumber(), bpaApplication.getOwner().getUser().getEmailId(), "", "");
    }
}