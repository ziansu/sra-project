public void onModuleLoad() {
    ru.scrumdev.sample.client.ui.View view = new ru.scrumdev.sample.client.ui.View();
    view.setStyleName("helloWidgetPanel");
    ru.scrumdev.sample.client.RootPanel.get("panelId").add(view);
    class MyHandler implements com.google.gwt.event.dom.client.ClickHandler , com.google.gwt.event.dom.client.KeyUpHandler {
        public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        }

        public void onKeyUp(com.google.gwt.event.dom.client.KeyUpEvent event) {
            if ((event.getNativeKeyCode()) == (com.google.gwt.event.dom.client.KeyCodes.KEY_ENTER)) {
            }
        }
    }
}