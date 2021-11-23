public com.amazonaws.services.glacier.AmazonGlacierClient makeClient(java.lang.String accessorString, java.lang.String secretiveString, int region) {
    com.amazonaws.auth.BasicAWSCredentials credentials = new com.amazonaws.auth.BasicAWSCredentials(accessorString, secretiveString);
    client = new com.amazonaws.services.glacier.AmazonGlacierClient(credentials);
    com.brianmcmichael.SimpleGlacierUploader.Endpoints ep = new com.brianmcmichael.SimpleGlacierUploader.Endpoints();
    java.lang.String endpointUrl = ep.Endpoint(region);
    client.setEndpoint(endpointUrl);
    return client;
}