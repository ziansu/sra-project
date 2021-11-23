@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent clickEvent) {
    if (validateParams()) {
        setRegButton("Please wait...", false);
        saveSimConfig();
        registerODDE();
    }
}