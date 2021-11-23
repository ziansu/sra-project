public void testCategoryLength() throws java.lang.Exception {
    solo.sleep(10000);
    solo.waitForActivity(solo.getCurrentActivity().toString());
    android.widget.TextView text = ((android.widget.TextView) (solo.getCurrentActivity().findViewById(R.id.tv_category)));
    assertTrue(((text.getText().length()) > 3));
}