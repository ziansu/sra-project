@com.thoughtworks.gauge.Step(value = "Open SCM")
public void openSCM() {
    Driver.webDriver.get(com.cloudogu.ces.EcoSystem.getUrl("/scm"));
    org.junit.Assert.assertThat(Driver.webDriver.getTitle(), org.hamcrest.Matchers.startsWith("CAS"));
}