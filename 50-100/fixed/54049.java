private void clearFilterSelection() {
    org.eclipse.swt.widgets.Label noSelectedFilterLabel = new org.eclipse.swt.widgets.Label(filterParametersScrolledComposite, org.eclipse.swt.SWT.NONE);
    noSelectedFilterLabel.setBackground(org.eclipse.wb.swt.SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
    noSelectedFilterLabel.setText("No filter selected.");
    filterParametersScrolledComposite.setContent(noSelectedFilterLabel);
    filterParametersScrolledComposite.setMinSize(noSelectedFilterLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT));
    filterParameters.clear();
    clearValidationErrorMessage();
    applyFilterButton.setEnabled(false);
}