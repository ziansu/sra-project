@java.lang.Override
public boolean updateCandidateStatus(java.lang.Integer candidateID, java.lang.Integer newStatusID) {
    if ((getCandidateById(candidateID).getStatusId()) != newStatusID) {
        sendEmailService.sendEmailToStudentsByStatus(ua.netcracker.model.service.impl.Status.values()[newStatusID]);
    }
    return candidateDAO.updateCandidateStatus(candidateID, newStatusID);
}