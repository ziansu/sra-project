public static void resetTestConfig() {
    at.scch.teclo.BugzillaSetup.checkDriver();
    at.scch.teclo.BugzillaSetup.login();
    if (!(at.scch.teclo.BugzillaSetup.isTestSetup())) {
        at.scch.teclo.BugzillaSetup.Logger.error("Reset aborted: {} not set up?", at.scch.teclo.BugzillaSetup.getTestConfigName());
        return ;
    }
    at.scch.teclo.pageobjects.ConfigRequiredSettingsPage configRequiredSettingsPage = at.scch.teclo.BugzillaSetup.gotoConfigRequiredSettingsPage();
    configRequiredSettingsPage.setAnnounceHtml("");
    at.scch.teclo.pageobjects.ConfigBugFieldsPage configBugFieldsPage = at.scch.teclo.BugzillaSetup.gotoConfigBugFieldsPage();
    configBugFieldsPage.setUseStatusWhiteboard(true);
    at.scch.teclo.BugzillaSetup.Logger.info("Reset of test configuration: {}.", at.scch.teclo.BugzillaSetup.getTestConfigName());
}