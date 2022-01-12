private static void waitForChangeToComplete(java.lang.String zoneName, java.lang.String changeId) {
    while (true) {
        com.google.gcloud.dns.ChangeRequest changeRequest = com.google.gcloud.dns.it.ITDnsTest.DNS.getChangeRequest(zoneName, changeId, Dns.ChangeRequestOption.fields(Dns.ChangeRequestField.STATUS));
        if (ChangeRequest.Status.DONE.equals(changeRequest.status())) {
            return ;
        }
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
            org.junit.Assert.fail("Thread was interrupted while waiting for change processing.");
        }
    } 
}