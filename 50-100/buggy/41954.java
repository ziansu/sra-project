@org.junit.Test
public void doesAverageSuccessRateField_OnTogglePlay_BeforeActive() throws java.lang.Exception {
    controller.views.npSets.setValue(1);
    controller.views.npReps.setValue(10);
    controller.views.npSuccesses.setValue(5);
    controller.views.fab.performClick();
    org.robolectric.shadows.ShadowDialog.getLatestDialog().dismiss();
    controller.views.fab.performClick();
    controller.views.npReps.setValue(10);
    controller.views.npSuccesses.setValue(10);
    controller.views.fab.performClick();
    org.robolectric.shadows.ShadowDialog.getLatestDialog().dismiss();
    controller.views.fab.performClick();
    junit.framework.Assert.assertEquals(0.75, controller.successRate);
}