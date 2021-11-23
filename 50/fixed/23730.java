@org.junit.Before
public void setUp() {
    seedu.address.ui.StatusBarFooter statusBarFooter = new seedu.address.ui.StatusBarFooter(seedu.address.ui.StatusBarFooterTest.STUB_SAVE_LOCATION, 0);
    uiPartRule.setUiPart(statusBarFooter);
    statusBarFooterHandle = new guitests.guihandles.StatusBarFooterHandle(statusBarFooter.getRoot());
}