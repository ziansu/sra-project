public void onModuleLoad() {
    ru.scrumdev.sample.client.ui.View helloWidgetPanel = new ru.scrumdev.sample.client.ui.View();
    helloWidgetPanel.setStyleName("helloWidgetPanel");
    ru.scrumdev.sample.client.RootPanel.get("panelId").add(helloWidgetPanel);
    class MyHandler implements com.google.gwt.event.dom.client.ClickHandler , com.google.gwt.event.dom.client.KeyUpHandler {
        public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        }

        public void onKeyUp(com.google.gwt.event.dom.client.KeyUpEvent event) {
            if ((event.getNativeKeyCode()) == (com.google.gwt.event.dom.client.KeyCodes.KEY_ENTER)) {
            }
        }
    }
}