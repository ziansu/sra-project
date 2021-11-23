private com.amazonaws.services.s3.AmazonS3 initClient() {
    jp.classmethod.aws.gradle.AwsPluginExtension aws = project.getExtensions().getByType(jp.classmethod.aws.gradle.AwsPluginExtension.class);
    com.amazonaws.ClientConfiguration clientConfiguration = new com.amazonaws.ClientConfiguration();
    clientConfiguration.setMaxErrorRetry(maxErrorRetry);
    com.amazonaws.services.s3.AmazonS3Client client = aws.createClient(com.amazonaws.services.s3.AmazonS3Client.class, profileName, clientConfiguration);
    if ((region) != null) {
        client.setRegion(com.amazonaws.regions.RegionUtils.getRegion(region));
    }
    return client;
}