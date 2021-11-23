@com.thoughtworks.gauge.Step(value = "Obtain SCM json file")
public void compareJsonFile() {
    com.thoughtworks.gauge.datastore.DataStore scenarioStore = com.thoughtworks.gauge.datastore.DataStoreFactory.getScenarioDataStore();
    com.cloudogu.ces.SCMAPI api = ((com.cloudogu.ces.SCMAPI) (scenarioStore.get("api")));
    java.lang.String user = ((java.lang.String) (scenarioStore.get("user")));
    java.lang.String userName = api.getFirstName();
    org.junit.Assert.assertThat(userName, org.hamcrest.Matchers.is(user));
}