@java.lang.Override
public com.liferay.micro.maintainance.task.model.CandidateMaintenance addCandidateMaintenance(long candidateEntryId, long taskEntryId) throws com.liferay.portal.kernel.exception.PortalException {
    long candidateMaintenanceId = counterLocalService.increment();
    java.util.Date now = new java.util.Date();
    com.liferay.micro.maintainance.task.model.CandidateMaintenance candidateMaintenance = candidateMaintenancePersistence.create(candidateEntryId);
    candidateMaintenance.setCandidateEntryId(candidateEntryId);
    candidateMaintenance.setTaskEntryId(taskEntryId);
    candidateMaintenance.setCreateDate(now);
    return candidateMaintenance;
}