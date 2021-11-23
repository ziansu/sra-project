public java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogByDossierId(long dossierId, int syncStatus) throws com.liferay.portal.kernel.exception.SystemException {
    return dossierLogPersistence.findByDossierIdSync(dossierId, syncStatus);
}