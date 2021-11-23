@java.lang.Override
public com.dukascopy.api.IOrder answer(final org.mockito.invocation.InvocationOnMock invocation) {
    assertIsBusy(orderInProgress.getInstrument(), true);
    orderMessageSendCall = () -> sendStopLossMessage(orderInProgress, stopLoss);
    return orderInProgress;
}