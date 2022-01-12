@org.junit.Test
public void doesAddElapsedTimeToActiveWorkIfDrillActive_OnBtnFinishedClick() throws java.lang.Exception {
    controller.views.fab.performClick();
    org.robolectric.shadows.ShadowDialog.getLatestDialog().dismiss();
    controller.views.btnFinished.performClick();
    junit.framework.Assert.assertNotNull(controller.activeWorkTime);
    junit.framework.Assert.assertTrue(((controller.activeWorkTime) > 0));
}