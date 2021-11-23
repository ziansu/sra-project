@org.junit.Test
public void shouldActivityStartedOnMenuItem() {
    android.content.Intent expectedIntent = new android.content.Intent(activity, unisannio.ingsoft.bbm.MapsActivity.class);
    android.view.MenuItem menuItem = new org.robolectric.fakes.RoboMenuItem(R.id.action_brewerymap);
    activity.onOptionsItemSelected(menuItem);
    org.robolectric.shadows.ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
    android.content.Intent actualIntent = shadowActivity.getNextStartedActivity();
    junit.framework.Assert.assertTrue(actualIntent.filterEquals(expectedIntent));
}