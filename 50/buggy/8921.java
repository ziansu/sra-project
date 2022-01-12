public void preselectCamelVersionForRuntime(java.lang.String runtimeCamelVersion) {
    if (org.fusesource.ide.foundation.ui.util.Widgets.isDisposed(camelVersionCombo)) {
        return ;
    }
    if (org.fusesource.ide.projecttemplates.wizards.pages.FuseIntegrationProjectWizardRuntimeAndCamelPage.UNKNOWN_CAMEL_VERSION.equals(runtimeCamelVersion)) {
        camelVersionCombo.setEnabled(true);
    }
    camelVersionCombo.setText(runtimeCamelVersion);
}