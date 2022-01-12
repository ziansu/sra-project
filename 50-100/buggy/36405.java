@java.lang.Override
public boolean usedAsType(net.ontopia.topicmaps.core.TopicIF topic) {
    return ((((topics.containsKey(topic)) || (occurs.containsKey(topic))) || (assocs.containsKey(topic))) || (roles.containsKey(topic))) || (bnames.containsKey(topic));
}