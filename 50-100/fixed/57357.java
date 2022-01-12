@org.vaadin.spring.events.annotation.EventBusListenerMethod(scope = org.vaadin.spring.events.EventScope.SESSION)
void onEvent(final org.eclipse.hawkbit.ui.filtermanagement.event.CustomFilterUIEvent custFUIEvent) {
    if (custFUIEvent == (org.eclipse.hawkbit.ui.filtermanagement.event.CustomFilterUIEvent.UPDATE_TARGET_FILTER_SEARCH_ICON)) {
        validationIcon.setValue(FontAwesome.CHECK_CIRCLE.getHtml());
        if (!(isValidationError())) {
            validationIcon.setStyleName(SPUIStyleDefinitions.SUCCESS_ICON);
        }else {
            validationIcon.setStyleName(SPUIStyleDefinitions.ERROR_ICON);
        }
    }
}