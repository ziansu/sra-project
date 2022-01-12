@java.lang.Override
public com.dukascopy.api.IOrder answer(final org.mockito.invocation.InvocationOnMock invocation) {
    orderMessageSendCall = () -> sendStopLossMessage(orderInProgress, stopLoss);
    return orderInProgress;
}