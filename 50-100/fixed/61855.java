@java.lang.Override
public int getGroupIdInt(java.lang.String groupName) {
    for (com.ctrip.hermes.meta.entity.Topic topic : m_meta.getTopics().values()) {
        for (com.ctrip.hermes.meta.entity.ConsumerGroup group : topic.getConsumerGroups().values()) {
            if (group.getName().equals(groupName)) {
                return group.getId();
            }
        }
    }
    return 100;
}