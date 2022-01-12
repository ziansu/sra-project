public void onListUpdated(java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic> topics) {
    android.util.Log.i(NotificationConstants.TAG, "Topic list updated with topics: ");
    for (org.kaaproject.kaa.common.endpoint.gen.Topic topic : topics) {
        android.util.Log.i(NotificationConstants.TAG, topic.toString());
    }
    org.kaaproject.kaa.demo.notification.fragment.TopicFragment topicFragment = ((org.kaaproject.kaa.demo.notification.fragment.TopicFragment) (getSupportFragmentManager().findFragmentByTag(NotificationConstants.TOPIC_FRAGMENT_TAG)));
    if ((topicFragment != null) && (topicFragment.isVisible())) {
        ((org.kaaproject.kaa.demo.notification.fragment.OnFragmentUpdateEvent) (topicFragment)).onRefresh();
    }
}