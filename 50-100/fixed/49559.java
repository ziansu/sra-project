@java.lang.Override
public int publish(java.lang.String destination, java.util.Map<java.lang.String, java.lang.String> notificationMessage) {
    com.cisco.bitbucket.plugin.publisher.LogPublisher.log.info("Destination: {}", destination);
    com.cisco.bitbucket.plugin.publisher.LogPublisher.log.info("Notification: \n");
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : notificationMessage.entrySet()) {
        com.cisco.bitbucket.plugin.publisher.LogPublisher.log.info("key: {}", entry.getKey());
        com.cisco.bitbucket.plugin.publisher.LogPublisher.log.info("value: {}", entry.getValue());
    }
    return 0;
}