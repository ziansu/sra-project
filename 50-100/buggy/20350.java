@org.junit.Test
public void theUserReceivesAPublicAndPrivateMessageThenTheAmountOfReceivedMessagesIsIncrementedByTwo() {
    unq.tpi.desapp.grupof.model.PublicMessage publicMessage = org.mockito.Mockito.mock(unq.tpi.desapp.grupof.model.PublicMessage.class);
    unq.tpi.desapp.grupof.model.PrivateMessage privateMessage = org.mockito.Mockito.mock(unq.tpi.desapp.grupof.model.PrivateMessage.class);
    unq.tpi.desapp.grupof.model.User anUser = new unq.tpi.desapp.grupof.model.builder.UserDriverBuilder().build();
    anUser.receiveMessage(publicMessage);
    anUser.receiveMessage(privateMessage);
    org.junit.Assert.assertEquals(2, anUser.getReceivedMessages().size());
}