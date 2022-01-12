@java.lang.Override
public void removeHandler() {
    if ((eventHandler) instanceof com.google.gwt.event.dom.client.ClickHandler) {
        clickHandlers.remove(eventHandler);
    }else
        if ((eventHandler) instanceof com.google.gwt.event.logical.shared.ValueChangeHandler<?>) {
            valueChangeHandlers.remove(eventHandler);
        }
    
}