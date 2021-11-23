public void sendNotification(com.wowza.wms.mediacaster.IMediaCaster mediaCaster, java.lang.String message) {
    gcloudPublisher.publishMessage(this.topicName, message);
}