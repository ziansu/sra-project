public void registerAttachment(org.silverpeas.core.WAPrimaryKey resourcePk, java.lang.String contributionLanguage, boolean indexIt) {
    org.silverpeas.core.contribution.attachment.model.SimpleDocument document = retrieveSimpleDocument(resourcePk, contributionLanguage);
    org.silverpeas.core.contribution.attachment.AttachmentServiceProvider.getAttachmentService().createAttachment(document, getFile(), indexIt);
    markAsProcessed();
}