public org.orcid.jaxb.model.message.WorkExternalIdentifier toMessagePojo() {
    org.orcid.core.adapter.impl.jsonidentifiers.WorkExternalIdentifier messagePojo = new org.orcid.core.adapter.impl.jsonidentifiers.WorkExternalIdentifier();
    try {
        messagePojo.setWorkExternalIdentifierType(org.orcid.jaxb.model.message.WorkExternalIdentifierType.fromValue(conv.convertFrom(this.getWorkExternalIdentifierType(), null)));
    } catch (java.lang.Exception e) {
        messagePojo.setWorkExternalIdentifierType(WorkExternalIdentifierType.OTHER_ID);
    }
    messagePojo.setWorkExternalIdentifierId(new org.orcid.core.adapter.impl.jsonidentifiers.WorkExternalIdentifierId());
    messagePojo.getWorkExternalIdentifierId().setContent(this.getWorkExternalIdentifierId().content);
    return messagePojo;
}