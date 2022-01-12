@java.lang.Override
public void handleEvent(org.jahia.ajax.gwt.client.widget.content.BaseEvent be) {
    if (!(tab.isExpanded())) {
        tab.refresh(null);
    }
}