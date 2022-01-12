private com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getChildComponents() {
    java.util.List<com.vaadin.client.ComponentConnector> childComponents = connector.getChildComponents();
    com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> array = com.google.gwt.core.client.JavaScriptObject.createArray().cast();
    for (com.vaadin.client.ComponentConnector cc : childComponents) {
        array.push(org.vaadin.plugin.client.ui.JavaScriptLayoutConnectorHelper.createWidgetWrapper(cc, cc.getWidget(), cc.getConnectorId(), cc.getWidget().getElement()));
    }
    return array;
}