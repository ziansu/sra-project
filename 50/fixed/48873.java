@org.junit.Test
public void onBackActivityShouldReturnChildImmunizationActivityClass() {
    assertNotNull(activity.getVaccinatorApplicationInstance());
    assertTrue(((activity.onBackActivity()) == (org.smartregister.path.activity.ChildImmunizationActivity.class)));
}