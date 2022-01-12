@java.lang.Override
public void configure(org.apache.jmeter.testelement.TestElement el) {
    super.configure(el);
    org.apache.jmeter.protocol.http.control.CookieManager cookieManager = ((org.apache.jmeter.protocol.http.control.CookieManager) (el));
    populateTable(cookieManager);
    clearEachIteration.setSelected(cookieManager.getClearEachIteration());
    java.lang.String fullImpl = cookieManager.getImplementation();
    selectHandlerPanel.setSelectedItem(fullImpl.substring(((fullImpl.lastIndexOf('.')) + 1)));
    policy.setText(cookieManager.getPolicy());
}