public static java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> findByColumnAndValue(java.lang.String column, java.lang.String value) {
    org.launchcode.techjobs.console.JobData.loadData();
    java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> jobs = new java.util.ArrayList<>();
    for (java.util.HashMap<java.lang.String, java.lang.String> row : org.launchcode.techjobs.console.JobData.allJobs) {
        java.lang.String aValue = row.get(column);
        if (aValue.contains(value)) {
            jobs.add(row);
        }
    }
    return jobs;
}