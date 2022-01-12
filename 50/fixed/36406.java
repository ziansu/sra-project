public static java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> findAll() {
    org.launchcode.techjobs.console.JobData.loadData();
    return org.launchcode.techjobs.console.JobData.allJobs;
}