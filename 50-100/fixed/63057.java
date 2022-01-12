public void subscribe() throws javax.jms.JMSException {
    topicSubs1 = ts1.createSubscriber(t3);
    topicSubs2 = ts2.createSubscriber(t3);
    topicPublisher = ts3.createPublisher(t3);
    topicSubs1.setMessageListener(new dtm.JMSManager.Listener1());
    topicSubs2.setMessageListener(new dtm.JMSManager.Listener2());
}