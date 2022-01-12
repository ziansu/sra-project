protected org.eclipse.vorto.wizard.ModelBaseWizardPage.ValidationResult invalid(java.lang.String errorMessage) {
    org.eclipse.vorto.wizard.ModelBaseWizardPage.ValidationResult result = new org.eclipse.vorto.wizard.ModelBaseWizardPage.ValidationResult();
    result.isValid = false;
    result.errorMessage = errorMessage;
    return result;
}