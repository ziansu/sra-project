@org.junit.Test
public void testAddMoreMessage() {
    java.util.List<it.bisignano.mychatserver.Message> messageList = new java.util.ArrayList<it.bisignano.mychatserver.Message>();
    it.bisignano.mychatserver.Message m1 = org.mockito.Mockito.mock(it.bisignano.mychatserver.Message.class);
    it.bisignano.mychatserver.Message m2 = org.mockito.Mockito.mock(it.bisignano.mychatserver.Message.class);
    it.bisignano.mychatserver.MyChatServer.addMessage(m1);
    it.bisignano.mychatserver.MyChatServer.addMessage(m2);
    messageList.add(m1);
    messageList.add(m2);
    org.junit.Assert.assertEquals(messageList, it.bisignano.mychatserver.MyChatServer.getMessageList());
}