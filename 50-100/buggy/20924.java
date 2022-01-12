@org.junit.Test
public void removeRequestRemovesTheGivenRequestOfTheRequestsReceivedTheUser() {
    unq.tpi.desapp.grupof.model.Request request = org.mockito.Mockito.mock(unq.tpi.desapp.grupof.model.Request.class);
    unq.tpi.desapp.grupof.model.Request otherRequest = org.mockito.Mockito.mock(unq.tpi.desapp.grupof.model.Request.class);
    unq.tpi.desapp.grupof.model.User user = new unq.tpi.desapp.grupof.model.builder.UserDriverBuilder().witRequestsReceived(new java.util.ArrayList<unq.tpi.desapp.grupof.model.Request>(java.util.Arrays.asList(request, otherRequest))).build();
    user.removeRequest(otherRequest);
    org.junit.Assert.assertEquals(request, user.getRequestsReceived().get(0));
}