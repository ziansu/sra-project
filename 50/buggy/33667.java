@java.lang.Override
public void handleEvent(org.jahia.ajax.gwt.client.widget.content.BaseEvent be) {
    if (!(tab.isExpanded())) {
        tabExpanded = true;
        tab.refresh(null);
    }
}