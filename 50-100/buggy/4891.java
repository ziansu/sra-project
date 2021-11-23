@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    java.lang.System.out.println(("selectedValues::+" + (selValues.contains(domainStand.getCodeId().toString()))));
    if (selValues.contains(domainStand.getCodeId().toString())) {
        selectedValues.remove(domainStand.getCodeId());
    }
    standardsCode.removeStyleName("active");
    removeGradeWidget(ulSelectedItems, domainStand.getCodeId());
    liPanelWithClose.removeFromParent();
}