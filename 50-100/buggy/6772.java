@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public org.orcid.jaxb.model.message.OrcidProfile updateOrcidBio(org.orcid.jaxb.model.message.OrcidProfile updatedOrcidProfile) {
    org.orcid.jaxb.model.message.OrcidProfile existingProfile = retrieveOrcidProfile(updatedOrcidProfile.getOrcidIdentifier().getPath());
    if (existingProfile == null) {
        return null;
    }
    orcidJaxbCopyManager.copyUpdatedBioToExistingWithVisibility(existingProfile.getOrcidBio(), updatedOrcidProfile.getOrcidBio());
    existingProfile.setOrcidBio(updatedOrcidProfile.getOrcidBio());
    return updateOrcidProfile(existingProfile);
}