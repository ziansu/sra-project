@java.lang.Override
public com.amazonaws.services.s3.AmazonS3 loginAWS() {
    com.amazonaws.auth.AWSCredentials credentials = null;
    try {
        credentials = new com.amazonaws.auth.profile.ProfileCredentialsProvider().getCredentials();
    } catch (java.lang.Exception e) {
        throw new com.amazonaws.AmazonClientException(("Cannot load the credentials from the credential profiles file. " + ("Please make sure that your credentials file is at the correct " + "location (~/.aws/credentials), and is in valid format.")), e);
    }
    com.amazonaws.services.s3.AmazonS3 s3 = new com.amazonaws.services.s3.AmazonS3Client(credentials);
    com.amazonaws.regions.Region usWest2 = com.amazonaws.regions.Region.getRegion(Regions.US_WEST_2);
    s3.setRegion(usWest2);
    return s3;
}