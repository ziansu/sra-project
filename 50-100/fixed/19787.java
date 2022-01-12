public java.lang.String getClaim() {
    java.lang.StringBuilder claim = new java.lang.StringBuilder();
    for (hudson.model.IViewEntry job : jobs) {
        if (job.isClaimed()) {
            claim.append(job.getName()).append(": ").append(job.getClaim()).append(";");
        }
    }
    return claim.toString();
}