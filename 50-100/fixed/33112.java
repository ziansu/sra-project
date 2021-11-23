@java.lang.Override
protected boolean matchesSafely(final T actual, final org.hamcrest.Description mismatchDescription) {
    if ((this.expected.isSame(actual)) || (this.expected.isBefore(actual))) {
        mismatchDescription.appendText(("date is " + (this.describer.describe(actual))));
        return false;
    }else {
        return true;
    }
}