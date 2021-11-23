@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    if (selValues.contains(domainStand.getCodeId().toString())) {
        selectedValues.remove(domainStand.getCodeId());
    }
    standardsCode.removeStyleName("active");
    removeGradeWidget(ulSelectedItems, domainStand.getCodeId());
    liPanelWithClose.removeFromParent();
}