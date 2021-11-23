@org.junit.Test
public void testPageExtensionProperties() {
    replay(this.service, this.request, this.response, this.user);
    assertEquals("The settings group is not correct.", "Project-related Settings", this.extension.getGroup());
    assertEquals("The tab ID is not correct.", SharedBuildNumberController.TAB_ID, this.extension.getTabId());
    assertEquals("The includeUrl is not correct.", (("/plugin/" + (net.nicholaswilliams.java.teamcity.plugin.buildNumber.TestSharedBuildNumberController.testNum)) + "/jsp/adminTab.jsp"), this.extension.getIncludeUrl());
    assertEquals("The title is not correct.", "Shared Build Numbers", this.extension.getTabTitle());
}