private void mustFail(java.text.DateFormat fmt, java.lang.String input, int errorOffset) {
    try {
        java.util.Date result = fmt.parse(input);
        org.junit.Assert.fail(java.lang.String.format("'%s' is not a valid date in %s mode", input, (fmt.isLenient() ? "lenient" : "strict")));
    } catch (java.text.ParseException e) {
        org.junit.Assert.assertThat(e.getErrorOffset(), org.hamcrest.CoreMatchers.is(errorOffset));
    }
}