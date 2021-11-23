@java.lang.Override
public void run() {
    try {
        snsClient = new com.amazonaws.services.sns.AmazonSNSClient(new com.amazonaws.auth.BasicAWSCredentials());
        snsClient.setRegion(com.amazonaws.regions.Region.getRegion(Regions.EU_WEST_1));
        com.amazonaws.services.sns.model.PublishRequest publishRequest = new com.amazonaws.services.sns.model.PublishRequest();
        publishRequest.setMessage(message);
        publishRequest.setSubject(subject);
        publishRequest.withTargetArn(arn);
        snsClient.publish(publishRequest);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        android.util.Log.d("sns", "no");
    }
}