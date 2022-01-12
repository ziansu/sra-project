@java.lang.Override
public java.util.List<com.liferay.micro.maintainance.api.Task> getRunningVotes(long wikiPageId) throws com.liferay.portal.kernel.exception.PortalException {
    java.util.List<com.liferay.micro.maintainance.api.Task> runningVotes = new java.util.ArrayList<>();
    com.liferay.micro.maintainance.candidate.model.CandidateEntry candidateEntry = com.liferay.micro.maintainance.candidate.service.CandidateEntryLocalServiceUtil.getCandidateByWikiPageId(wikiPageId);
    for (com.liferay.micro.maintainance.api.Task task : _registeredTasks.values()) {
        if ((com.liferay.micro.maintainance.task.service.CandidateMaintenanceLocalServiceUtil.getCandidateMaintenaceTask(candidateEntry.getCandidateEntryId(), task.getTaskId())) != null) {
            runningVotes.add(task);
        }
    }
    return runningVotes;
}