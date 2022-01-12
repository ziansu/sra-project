private void adjustVerifyEmailPolicies(org.sagebionetworks.bridge.models.studies.Study study, com.stormpath.sdk.directory.Directory directory) {
    com.stormpath.sdk.directory.AccountCreationPolicy policy = directory.getAccountCreationPolicy();
    com.stormpath.sdk.mail.ModeledEmailTemplate template = policy.getAccountVerificationEmailTemplates().iterator().next();
    updateTemplate(study, template, study.getVerifyEmailTemplate(), "verifyEmail");
    policy.setVerificationEmailStatus(EmailStatus.ENABLED);
    policy.setVerificationSuccessEmailStatus(EmailStatus.DISABLED);
    policy.setWelcomeEmailStatus(EmailStatus.DISABLED);
    policy.save();
}