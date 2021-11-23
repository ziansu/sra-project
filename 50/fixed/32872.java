@org.junit.Test
public void getViewPagerAdapterShouldHaveTwoFragments() {
    assertNotNull(activity.getViewPagerAdapter().getItem(0));
    assertNotNull(activity.getViewPagerAdapter().getItem(1));
}