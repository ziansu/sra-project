private void showValidationInProgress() {
    validationIcon.setValue(null);
    validationIcon.addStyleName("show-status-label");
    validationIcon.setStyleName(SPUIStyleDefinitions.TARGET_FILTER_SEARCH_PROGRESS_INDICATOR_STYLE);
}