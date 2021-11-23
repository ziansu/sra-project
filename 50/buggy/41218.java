@java.lang.Override
public void describeTo(final org.hamcrest.Description description) {
    description.appendText(("matches format " + (strDateFormat.toString())));
}