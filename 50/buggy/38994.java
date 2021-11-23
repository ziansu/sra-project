public com.silverpeas.publicationTemplate.PublicationTemplate getOrderTemplate(boolean register) throws com.silverpeas.publicationTemplate.PublicationTemplateException {
    return getTemplate(getOrderForm(), register);
}