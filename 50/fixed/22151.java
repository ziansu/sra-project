@org.junit.Test
public void shouldReturnTrueOnOptionsMenuCaseRecurringServices() {
    org.smartregister.path.activity.mocks.MenuItemTestVersion menuItem = new org.smartregister.path.activity.mocks.MenuItemTestVersion();
    menuItem.setItemId(R.id.recurring_services_data);
    activity.onOptionsItemSelected(menuItem);
    boolean result = activity.onOptionsItemSelected(menuItem);
    assertTrue(result);
}