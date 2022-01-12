@java.lang.Override
public void apply() throws com.intellij.openapi.options.ConfigurationException {
    sonarModuleComponent.getState().host = txtHost.getText();
    sonarModuleComponent.getState().user = txtUser.getText();
    sonarModuleComponent.getState().password = new java.lang.String(txtPassword.getPassword());
    sonarModuleComponent.getState().projectKey = ((org.sonar.ide.intellij.model.SonarProject) (cmbProject.getSelectedItem())).getResource().getKey();
    sonarModuleComponent.getState().configured = true;
}