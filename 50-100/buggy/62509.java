public void removeTopic(java.lang.String topicName) {
    java.util.Iterator<org.iotivity.service.ns.common.Topic> it = getTopicsList().iterator();
    while (it.hasNext()) {
        if (it.next().getTopicName().equals(topicName)) {
            mTopicsList.remove(it.next());
        }
    } 
}