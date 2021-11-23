public void testInstanceOf_javaInstance() {
    java.lang.Object object = new com.google.gwt.core.client.interop.MyJsFunctionInterfaceImpl();
    assertTrue((object instanceof com.google.gwt.core.client.interop.MyJsFunctionInterface));
    assertTrue((object instanceof com.google.gwt.core.client.interop.MyJsFunctionInterfaceImpl));
    assertTrue((object instanceof com.google.gwt.core.client.interop.MyJsFunctionIdentityInterface));
    assertTrue((object instanceof com.google.gwt.core.client.interop.MyJsFunctionWithOnlyInstanceofReference));
    assertTrue((object instanceof com.google.gwt.core.client.interop.ElementLikeNativeInterface));
    assertFalse((object instanceof com.google.gwt.core.client.interop.HTMLElementConcreteNativeJsType));
}