public static java.lang.String createAndSubscribeQueue(java.lang.String topicArn, java.lang.String queueName) {
    java.lang.System.out.println(("Creating a new SQS queue called " + queueName));
    com.amazonaws.services.sqs.model.CreateQueueRequest createQueueRequest = new com.amazonaws.services.sqs.model.CreateQueueRequest(queueName);
    java.lang.String myQueueUrl = org.sensorhub.impl.sensor.nexrad.aws.sqs.QueueFactory.sqs.createQueue(createQueueRequest).getQueueUrl();
    com.amazonaws.services.sns.util.Topics.subscribeQueue(org.sensorhub.impl.sensor.nexrad.aws.sqs.QueueFactory.sns, org.sensorhub.impl.sensor.nexrad.aws.sqs.QueueFactory.sqs, topicArn, myQueueUrl);
    return myQueueUrl;
}