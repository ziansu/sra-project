@org.junit.Test
public void shouldDisplayOnOptionsMenuCaseImmunizationData() {
    org.smartregister.path.activity.mocks.MenuItemTestVersion menuItem = new org.smartregister.path.activity.mocks.MenuItemTestVersion();
    menuItem.setItemId(R.id.immunization_data);
    activity.onOptionsItemSelected(menuItem);
    java.util.ArrayList<android.view.View> outViews = new java.util.ArrayList<>();
    activity.findViewById(R.id.immunizations).findViewsWithText(outViews, "IMMUNIZATIONS", View.FIND_VIEWS_WITH_TEXT);
    junit.framework.Assert.assertFalse(outViews.isEmpty());
}