public void undeployApplication(java.lang.String appName) {
    javax.ws.rs.core.Response response = delete(uri, ((org.mule.tools.mule.agent.AgentApi.APPLICATIONS_PATH) + appName));
    if ((response.getStatus()) != 202) {
        throw new org.mule.tools.mule.ApiException(response, (((uri) + (org.mule.tools.mule.agent.AgentApi.APPLICATIONS_PATH)) + (applicationName)));
    }
}