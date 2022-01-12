@org.junit.Test
public void testVisibleWhenStarted() {
    mockServiceManager.startGPSLogging(sut.getActivity(), null);
    mockTracksProvider.loadFiveRecentWaypoints(mockServiceManager.getTrackId());
    nl.sogeti.android.gpstracker.ng.util.BindingUtilKt.executePendingBindings(sut.getBinding(), MockBroadcastSender.Espresso.getResource());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.fragment_recording_container)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
}