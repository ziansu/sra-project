private void loginToCasSCMApp(java.lang.String username, java.lang.String password) {
    com.cloudogu.ces.EcoSystem.loginToCasApp(username, password);
    org.junit.Assert.assertThat(Driver.webDriver.getTitle(), containsString("SCM Manager"));
}