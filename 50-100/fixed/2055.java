public au.edu.unsw.soacourse.job.model.JobPostings getAllJobPostings() {
    loadJobPostingsFromFile();
    java.util.List<au.edu.unsw.soacourse.job.model.JobPosting> jobPostingsList = new java.util.ArrayList<au.edu.unsw.soacourse.job.model.JobPosting>();
    for (au.edu.unsw.soacourse.job.model.JobPosting posting : contentStorePostings.values()) {
        jobPostingsList.add(posting);
    }
    if ((jobPostingsList.size()) == 0)
        return null;
    
    au.edu.unsw.soacourse.job.model.JobPostings newJobPostings = new au.edu.unsw.soacourse.job.model.JobPostings(jobPostingsList);
    return newJobPostings;
}