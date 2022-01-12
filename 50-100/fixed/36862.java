public com.emeraldElves.alcohollabelproject.SubmittedApplication getRandomApproved() {
    java.sql.ResultSet alcoholResult = db.select("*", "SubmittedApplications", ("status = " + (ApplicationStatus.APPROVED.getValue())));
    java.util.List<com.emeraldElves.alcohollabelproject.SubmittedApplication> applications = getApplicationsFromResultSet(alcoholResult);
    java.util.Random random = new java.util.Random();
    if (applications.isEmpty())
        return null;
    
    int pos = random.nextInt(applications.size());
    return applications.get(pos);
}