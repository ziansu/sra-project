@java.lang.Override
public void exec(java.lang.String output) {
    java.lang.String jobNamestr;
    java.lang.String nJobsstr = output.split("\n")[1];
    int nJobs = java.lang.Integer.parseInt(nJobsstr);
    nJobs = nJobs - 2;
    if (nJobs > 0) {
        UpdateJobs(nJobs);
    }
}