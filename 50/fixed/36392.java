@org.junit.Test
public void testGroupSeqIsNeverLost() throws java.lang.Exception {
    connection = createAmqpConnection();
    connection.start();
    sendMessagesToBroker(org.apache.qpid.jms.usecases.JmsLargeMessagesInGroupsTest.MESSAGE_COUNT);
    readMessagesOnBroker(org.apache.qpid.jms.usecases.JmsLargeMessagesInGroupsTest.MESSAGE_COUNT);
    sendMessagesToBroker(org.apache.qpid.jms.usecases.JmsLargeMessagesInGroupsTest.MESSAGE_COUNT);
    readMessagesOnBroker(org.apache.qpid.jms.usecases.JmsLargeMessagesInGroupsTest.MESSAGE_COUNT);
}