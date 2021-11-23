@org.junit.Test
public void testAddMessageId() {
    it.bisignano.mychatserver.Message m1 = org.mockito.Mockito.mock(it.bisignano.mychatserver.Message.class);
    int idMessage = it.bisignano.mychatserver.MyChatServer.addMessage(m1);
    org.junit.Assert.assertEquals(0, idMessage);
}