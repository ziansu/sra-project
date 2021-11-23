private boolean deleteMessage(java.lang.String emailHash, int mailId) {
    java.lang.String userID;
    if ((userID = com.amazonaws.samples.threadedConnection.userHashToID(emailHash, "getHistory")) == null) {
        return false;
    }
    java.lang.String mailPath = ((("data/" + userID) + "/mailbox/") + mailId) + ".json";
    if (!(com.amazonaws.samples.threadedConnection.s3Client.doesObjectExist(com.amazonaws.samples.threadedConnection.bucket, mailPath))) {
        java.lang.System.out.println("Mail item does not exist!");
        com.amazonaws.samples.threadedConnection.fileData += "deleteMessage: Mail item does not exist!\n";
        return false;
    }
    com.amazonaws.samples.threadedConnection.s3Client.deleteObject(new com.amazonaws.services.s3.model.DeleteObjectRequest(com.amazonaws.samples.threadedConnection.bucket, mailPath));
    return true;
}