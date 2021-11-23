@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void addEmail(java.lang.String orcid, java.lang.String email, org.orcid.jaxb.model.message.Visibility visibility, java.lang.String sourceId, java.lang.String clientSourceId) {
    addEmail(orcid, email, visibility, sourceId, clientSourceId, false, false);
}