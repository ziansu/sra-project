@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.List<com.done.analytics.domain.Topic> listTopics(java.lang.String selectedTopics) {
    java.util.List<com.done.analytics.domain.Topic> topicList = this.topicDAO.getTopicList();
    for (com.done.analytics.domain.Topic topic : topicList) {
        if (selectedTopics.contains(java.lang.Integer.toString(topic.getId()))) {
            topic.setIsSelected(true);
        }
    }
    return topicList;
}