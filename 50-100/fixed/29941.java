private void deleteProxyEntry(java.lang.String instanceId) {
    java.io.File sitesenabled = new java.io.File(("/etc/apache2/sites-enabled/005-" + (instanceId_)));
    sitesenabled.delete();
    java.io.File sitesavailable = new java.io.File(("/etc/apache2/sites-available/005-" + (instanceId_)));
    at.graz.meduni.bibbox.helper.ActivitiesProtocol.addActivityLogEntry(activityId_, "INFO", ("Deleting Link: " + (sitesenabled.getName())));
    sitesavailable.delete();
}