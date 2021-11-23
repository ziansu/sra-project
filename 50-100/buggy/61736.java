@java.lang.Override
public void apply() throws com.intellij.openapi.options.ConfigurationException {
    sonarModuleComponent.getState().host = txtHost.getText();
    sonarModuleComponent.getState().user = txtUser.getText();
    sonarModuleComponent.getState().password = txtPassword.getPassword().toString();
    sonarModuleComponent.getState().projectKey = ((org.sonar.ide.intellij.model.SonarProject) (cmbProject.getSelectedItem())).getResource().getKey();
    sonarModuleComponent.getState().configured = true;
}