@org.junit.Test
public void retrieveName() throws java.lang.Exception {
    pingproject.biz.beans.PingBean mockPingBean = mock(pingproject.biz.beans.PingBean.class);
    doReturn(mockPingBean).when(pingproject.web.ManagedBeans.PingWebBeanTest.spy).getPingBean();
    pingproject.web.ManagedBeans.PingWebBeanTest.spy.retrieveName();
    verify(pingproject.web.ManagedBeans.PingWebBeanTest.spy).getPingBean();
    verify(mockPingBean).retrieveName();
}