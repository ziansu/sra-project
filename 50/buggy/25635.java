@org.junit.Test
public void shouldDisplayOnOptionsMenuCaseReportDeceased() {
    org.smartregister.path.activity.mocks.MenuItemTestVersion menuItem = new org.smartregister.path.activity.mocks.MenuItemTestVersion();
    menuItem.setItemId(R.id.report_deceased);
    boolean result = activity.onOptionsItemSelected(menuItem);
    junit.framework.Assert.assertTrue(result);
}