@java.lang.Override
public void subscribeOnTopics() {
    com.stratelia.silverpeas.silverpeasinitialize.CallBackManager callBackManager = com.stratelia.silverpeas.silverpeasinitialize.CallBackManager.get();
    subscribeForNotifications(com.silverpeas.notification.NotificationTopic.onTopic(com.silverpeas.pdc.service.NODE_TOPIC.getTopicName()));
}