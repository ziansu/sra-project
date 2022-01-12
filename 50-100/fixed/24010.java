public void testLogoutCorrectRedirectIfLogoutCanceled() {
    android.app.Fragment fragment = new dhbw.mobile2.LogoutFragment();
    android.app.FragmentManager fragmentManager = getActivity().getFragmentManager();
    fragmentManager.beginTransaction().add(R.id.frame_container, fragment).commit();
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withText("No")).perform(android.support.test.espresso.action.ViewActions.click());
}