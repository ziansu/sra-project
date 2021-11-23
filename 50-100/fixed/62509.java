public void removeTopic(java.lang.String topicName) {
    java.util.Iterator<org.iotivity.service.ns.common.Topic> it = getTopicsList().iterator();
    while (it.hasNext()) {
        org.iotivity.service.ns.common.Topic element = it.next();
        if (element.getTopicName().equals(topicName)) {
            mTopicsList.remove(element);
        }
    } 
}