@org.junit.Test
public void testGetDisallowedViewWithAccessDeniedView() throws java.lang.Exception {
    viewProvider.setAccessDeniedViewClass(com.vaadin.spring.internal.SpringViewProviderAccessControlTest.MyAccessDeniedView.class);
    org.junit.Assert.assertTrue("Got disallowed view when should get access denied view", ((viewProvider.getView(com.vaadin.spring.internal.SpringViewProviderAccessControlTest.TestView1.VIEW_NAME)) instanceof com.vaadin.spring.internal.SpringViewProviderAccessControlTest.MyAccessDeniedView));
}