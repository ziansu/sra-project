public void checkInterviewerHasDateConflict() {
    pt.uc.dei.aor.pf.admin.InterviewSearchCDI.log.info("Checking if interviewer has date conflict");
    pt.uc.dei.aor.pf.entities.UserEntity interviewer = userEJB.find(id);
    if ((interviewer != null) && (interviewer.getRoles().contains("INTERVIEWER"))) {
        result = interviewEJB.interviewerHasDateConflict(date1, interviewer);
    }else
        pt.uc.dei.aor.pf.admin.InterviewSearchCDI.log.error(("No interviewer with id " + (id)));
    
}