@org.junit.Test
public void testSelectAppEngineApi() {
    appengineButton.click();
    java.util.List<com.google.cloud.tools.eclipse.appengine.libraries.model.Library> selectedLibraries = getSelectedLibrariesSorted();
    org.junit.Assert.assertNotNull(selectedLibraries);
    org.junit.Assert.assertThat(selectedLibraries.size(), org.hamcrest.CoreMatchers.is(1));
    org.junit.Assert.assertThat(selectedLibraries.get(0).getId(), org.hamcrest.CoreMatchers.is("appengine-api"));
}