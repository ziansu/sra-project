@java.lang.Override
public boolean usedAsAssociationType(net.ontopia.topicmaps.core.TopicIF topic) {
    if (topic == null) {
        return false;
    }
    return !(getAssociations(topic).isEmpty());
}