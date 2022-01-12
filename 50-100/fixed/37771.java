@org.junit.Test
public void temporarilyDisablesAsyncRequestsIfDisabled() throws java.lang.Exception {
    holder.setAsyncSupported(false);
    holder.handle(baseRequest, request, response);
    final org.mockito.InOrder inOrder = inOrder(baseRequest, servlet);
    inOrder.verify(baseRequest).setAsyncSupported(false, null);
    inOrder.verify(servlet).service(request, response);
}