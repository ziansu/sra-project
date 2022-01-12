@org.junit.Test
public void statusCheckerChecksUnpaidAndUnnotifiedOrdersAndFulfills() throws au.gov.qld.pub.orders.service.ServiceException {
    org.mockito.Mockito.when(orderService.findUnpaidOrderIds(minAge)).thenReturn(new java.util.HashSet<>(java.util.Arrays.asList(au.gov.qld.pub.orders.service.ScheduleServiceTest.UNPAID_ORDER_ID)));
    org.mockito.Mockito.when(orderService.notifyPayment(au.gov.qld.pub.orders.service.ScheduleServiceTest.UNPAID_ORDER_ID)).thenReturn(true);
    service.statusCheck();
    org.mockito.Mockito.verify(orderService).notifyPayment(au.gov.qld.pub.orders.service.ScheduleServiceTest.UNPAID_ORDER_ID);
    org.mockito.Mockito.verify(notifyService).send(au.gov.qld.pub.orders.service.ScheduleServiceTest.UNPAID_ORDER_ID);
}