@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    projectConfigurationPanel.removeCondition(disclosurePanel.getObject());
    disclosurePanels.remove(disclosurePanel);
    closeConditionTab(disclosurePanel.getObject().getId());
}