public java.lang.String getClaim() {
    java.lang.String claim = "";
    for (hudson.model.IViewEntry job : jobs) {
        if (job.isClaimed())
            claim += (((job.getName()) + ": ") + (job.getClaim())) + ";";
        
    }
    return claim;
}