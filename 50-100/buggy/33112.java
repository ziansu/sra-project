@java.lang.Override
protected boolean matchesSafely(final T actual, final org.hamcrest.Description mismatchDescription) {
    if ((expected.isSame(actual)) || (expected.isBefore(actual))) {
        mismatchDescription.appendText(("date is " + (describer.describe(actual))));
        return false;
    }else {
        return true;
    }
}