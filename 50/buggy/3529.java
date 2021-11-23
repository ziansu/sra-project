@org.junit.Test
public void testGetAllowedView() throws java.lang.Exception {
    allowViews(com.vaadin.spring.internal.SpringViewProviderAccessControlTest.TestView1.BEAN_NAME);
    org.junit.Assert.assertTrue("Could not get allowed view", ((viewProvider.getView(com.vaadin.spring.internal.SpringViewProviderAccessControlTest.TestView1.VIEW_NAME)) instanceof com.vaadin.spring.internal.SpringViewProviderAccessControlTest.TestView1));
}