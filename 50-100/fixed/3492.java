public boolean volunteerForJob(model.Job theJob, model.WorkLoad theWorkLoad) throws exception.AlreadyVolunteeredException, exception.ConflictingJobCommitmentException, exception.JobIsFullException, exception.JobToThePastException {
    checkForConflicts(theJob);
    if (theJob.hasMaxVolunteers(theWorkLoad))
        throw new exception.JobIsFullException();
    
    switch (theWorkLoad) {
        case LIGHT :
            theJob.addLightVolunteer(this);
            break;
        case MEDIUM :
            theJob.addMediumVolunteer(this);
            break;
        case DIFFICULT :
            theJob.addDifficultVolunteer(this);
            break;
    }
    return myJobs.add(theJob);
}