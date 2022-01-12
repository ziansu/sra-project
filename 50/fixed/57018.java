@java.lang.Override
public void setDockerAuthenticationFlow(final org.keycloak.models.AuthenticationFlowModel flow) {
    getDelegateForUpdate();
    updated.setDockerAuthenticationFlow(flow);
}