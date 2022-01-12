@org.junit.Test
public void editStatusSocketBinding() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String socketBinding = operations.createSocketBinding();
    page.getConfig().switchTo("Recovery");
    editTextAndVerify(address, STATUS_SOCKET_BINDING, STATUS_SOCKET_BINDING_ATTR, socketBinding);
}