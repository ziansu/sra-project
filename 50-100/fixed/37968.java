public void testViewVisible() {
    android.test.ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(), activity.findViewById(R.id.nav_toolbar));
    android.test.ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(), activity.findViewById(R.id.searchView));
}