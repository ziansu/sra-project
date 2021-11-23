public void subscribe() throws javax.jms.JMSException {
    inicializarTopic();
    topicSubs1 = ts1.createSubscriber(t1);
    topicSubs2 = ts2.createSubscriber(t2);
    topicPublisher = ts3.createPublisher(t3);
    topicSubs1.setMessageListener(new dtm.JMSManager.Listener1());
    topicSubs2.setMessageListener(new dtm.JMSManager.Listener2());
}