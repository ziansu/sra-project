public org.gbif.registry.surety.email.BaseEmailModel generateUserChallengeCodeEmailModel(org.gbif.api.model.common.GbifUser user, org.gbif.registry.surety.model.ChallengeCode challengeCode) {
    org.gbif.registry.surety.email.BaseEmailModel baseEmailModel = null;
    try {
        java.net.URL url = new java.net.URL(java.text.MessageFormat.format(urlTemplate, user.getUserName(), challengeCode.getCode()));
        org.gbif.registry.surety.email.BaseTemplateDataModel dataModel = new org.gbif.registry.surety.email.BaseTemplateDataModel(user.getName(), url);
        baseEmailModel = emailTemplateProcessor.buildEmail(user.getEmail(), dataModel, java.util.Locale.ENGLISH);
    } catch (freemarker.template.TemplateException | java.io.IOException ex) {
        org.gbif.identity.service.IdentityEmailTemplateProcessor.LOG.error("Error while generating e-mail.", ex);
    }
    return baseEmailModel;
}