@org.junit.Test
public void shouldRenderChildsRegisterCardNumberRow() {
    final java.util.ArrayList<android.view.View> outViews = new java.util.ArrayList<>();
    activity.getViewPagerAdapter().getItem(0).getView().findViewById(R.id.rowholder).findViewsWithText(outViews, "Child\'s register card number", View.FIND_VIEWS_WITH_TEXT);
    assertFalse(outViews.isEmpty());
}