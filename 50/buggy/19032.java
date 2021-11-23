@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    org.chromium.base.CommandLine.getInstance().appendSwitch(ContentSwitches.ENABLE_CREDENTIAL_MANAGER_API);
    loadNativeLibraryAndInitBrowserProcess();
}