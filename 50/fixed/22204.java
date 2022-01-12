private void addHelpLink() {
    if (org.apache.commons.lang3.StringUtils.isEmpty(helpLink)) {
        return ;
    }
    final com.vaadin.ui.Link helpLinkComponent = org.eclipse.hawkbit.ui.components.SPUIComponentProvider.getHelpLink(helpLink);
    buttonsLayout.addComponent(helpLinkComponent);
    buttonsLayout.setComponentAlignment(helpLinkComponent, Alignment.MIDDLE_RIGHT);
}