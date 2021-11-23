@org.junit.Test
public void showWeightDialogShouldRender() {
    activity.showWeightDialog(0);
    junit.framework.Assert.assertNotNull(activity.getFragmentManager().findFragmentByTag(ChildDetailTabbedActivity.DIALOG_TAG));
}