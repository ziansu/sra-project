@java.lang.Override
public void resetUserPassword(java.lang.String toEmail, org.orcid.jaxb.model.message.OrcidProfile orcidProfile) {
    org.orcid.core.manager.impl.RegistrationManagerImpl.LOGGER.debug("Resetting password for Orcid: {}", orcidProfile.getOrcidIdentifier().getPath());
    if (!(orcidProfile.getOrcidHistory().isClaimed())) {
        org.orcid.core.manager.impl.RegistrationManagerImpl.LOGGER.debug("Profile is not claimed so re-sending claim email instead of password reset: {}", orcidProfile.getOrcidIdentifier().getPath());
        notificationManager.sendApiRecordCreationEmail(toEmail, orcidProfile);
    }else {
        notificationManager.sendPasswordResetEmail(toEmail, orcidProfile);
    }
}