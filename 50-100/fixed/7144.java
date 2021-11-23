public void sendEmail(java.util.List<java.lang.String> institutionCodes, java.lang.Integer totalRecordCount, java.lang.Integer failedRecordCount, java.lang.String transmissionType, java.lang.String dateTimeStringForFolder, java.lang.String toEmailAddress) {
    org.recap.camel.EmailPayLoad emailPayLoad = new org.recap.camel.EmailPayLoad();
    emailPayLoad.setInstitutions(institutionCodes);
    emailPayLoad.setLocation(getLocation(transmissionType, dateTimeStringForFolder));
    emailPayLoad.setCount(totalRecordCount);
    emailPayLoad.setFailedCount(failedRecordCount);
    emailPayLoad.setTo(toEmailAddress);
    producer.sendBody(ReCAPConstants.EMAIL_Q, emailPayLoad);
}