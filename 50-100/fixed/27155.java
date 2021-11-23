@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void updateTopicsVote(java.lang.String selectedTopics) {
    for (com.done.analytics.domain.Topic topic : this.topicDAO.getTopicList()) {
        if (selectedTopics.contains(java.lang.Integer.toString(topic.getId()))) {
            topic.setTicketCount(((topic.getTicketCount()) + 1));
        }
    }
}