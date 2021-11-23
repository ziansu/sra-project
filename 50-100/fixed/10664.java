public void releaseKms(java.lang.String applicationId) throws org.kurento.client.internal.NotEnoughResourcesException {
    try {
        de.fhg.fokus.nubomedia.kmc.KmsUrlProvider.logger.info(("releasing KMS..." + applicationId));
        if ((record) == null)
            return ;
        
        vnfrService.unregisterApplication(record.get(applicationId).getInternalAppId());
        timerTask.cancel();
    } catch (java.lang.Exception e) {
        throw new org.kurento.client.internal.NotEnoughResourcesException(("An error occured in releasing the KMS - " + (e.getMessage())));
    }
}