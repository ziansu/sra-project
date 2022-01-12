public com.emeraldElves.alcohollabelproject.SubmittedApplication getRandomApproved() {
    java.sql.ResultSet alcoholResult = db.select("*", "SubmittedApplications", ("status = " + (ApplicationStatus.APPROVED.getValue())));
    java.util.List<com.emeraldElves.alcohollabelproject.SubmittedApplication> applications = getApplicationsFromResultSet(alcoholResult);
    java.util.Random random = new java.util.Random();
    int pos = random.nextInt(applications.size());
    if (applications.isEmpty())
        return null;
    
    return applications.get(pos);
}