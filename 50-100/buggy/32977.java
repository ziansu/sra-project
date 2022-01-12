public au.edu.unsw.soacourse.job.model.JobApplications searchJobApplicationsUserId(java.lang.String query) {
    loadJobApplicationsFromFile();
    java.util.List<au.edu.unsw.soacourse.job.model.JobApplication> JobApplicationsList = new java.util.ArrayList<au.edu.unsw.soacourse.job.model.JobApplication>();
    for (au.edu.unsw.soacourse.job.model.JobApplication app : contentStoreApplications.values()) {
        if (app.getUserProfileId().matches(query)) {
            JobApplicationsList.add(app);
        }
    }
    au.edu.unsw.soacourse.job.model.JobApplications newJobApplications = new au.edu.unsw.soacourse.job.model.JobApplications(JobApplicationsList);
    return newJobApplications;
}