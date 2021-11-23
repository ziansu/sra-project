public boolean volunteerForJob(model.Job theJob, model.WorkLoad theWorkLoad) throws exception.AlreadyVolunteeredException, exception.ConflictingJobCommitmentException, exception.JobIsFullException, exception.JobToThePastException {
    checkForConflicts(theJob);
    if (theJob.hasMaxVolunteers(theWorkLoad))
        throw new exception.JobIsFullException();
    
    switch (theWorkLoad) {
        case LIGHT :
            theJob.addLightVolunteer(this);
        case MEDIUM :
            theJob.addMediumVolunteer(this);
        case DIFFICULT :
            theJob.addDifficultVolunteer(this);
    }
    return myJobs.add(theJob);
}