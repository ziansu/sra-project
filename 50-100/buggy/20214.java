public void testCast_crossCastJavaInstance() {
    java.lang.Object o = (com.google.gwt.core.client.interop.JsFunctionTest.alwaysTrue()) ? new com.google.gwt.core.client.interop.MyJsFunctionInterfaceImpl() : new java.lang.Object();
    assertEquals(11, ((com.google.gwt.core.client.interop.MyOtherJsFunctionInterface) (o)).bar(10));
    assertSame(((com.google.gwt.core.client.interop.MyJsFunctionInterface) (o)), ((com.google.gwt.core.client.interop.MyOtherJsFunctionInterface) (o)));
}