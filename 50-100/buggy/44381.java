@org.junit.Test
public void doesAddElapsedTimeToActiveWorkIfDrillActive_OnBtnFinishedClick() throws java.lang.Exception {
    controller.views.fab.performClick();
    android.app.Dialog resultDialog = org.robolectric.shadows.ShadowDialog.getLatestDialog();
    resultDialog.dismiss();
    controller.views.btnFinished.performClick();
    junit.framework.Assert.assertNotNull(controller.activeWorkTime);
    junit.framework.Assert.assertTrue(((controller.activeWorkTime) > 0));
}