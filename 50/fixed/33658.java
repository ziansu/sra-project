@org.junit.Test
public void testDataItemNotInAdapter() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.listView)).check(android.support.test.espresso.assertion.ViewAssertions.matches(org.hamcrest.CoreMatchers.not(withAdaptedData(withUnitName("kgl")))));
}