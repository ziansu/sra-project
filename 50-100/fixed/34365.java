public void searchScheduledInterviewsByUser() {
    pt.uc.dei.aor.pf.admin.InterviewSearchCDI.log.info("Searching scheduled interviews of interviewer");
    pt.uc.dei.aor.pf.entities.UserEntity interviewer = userEJB.find(id);
    if (interviewer != null) {
        this.ilist = interviewEJB.findScheduledInterviewsByUser(interviewer);
    }else
        pt.uc.dei.aor.pf.admin.InterviewSearchCDI.log.error(("No interviewer with id " + (id)));
    
}