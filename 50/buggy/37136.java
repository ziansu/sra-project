@org.junit.Test
public void setCommitterInfo() throws java.lang.Exception {
    client.setCommiterInfo(cheServerUrl, io.fabric8.che.starter.client.WorkspacePreferencesClientTest.KEYCLOAK_TOKEN, getTestPreferences());
    checkCommitterInfoSetCorrectly();
}