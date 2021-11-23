@java.lang.Override
public boolean usedAsAssociationType(net.ontopia.topicmaps.core.TopicIF topic) {
    return !(getAssociations(topic).isEmpty());
}