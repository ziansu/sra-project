@java.lang.Override
public <OutType> void onFinish(OutType result) {
    org.junit.Assert.assertTrue(((maxReceivedProgress) > 95.0F));
    if (result instanceof java.lang.Integer) {
        org.hamcrest.MatcherAssert.assertThat(result, org.hamcrest.CoreMatchers.is(0));
    }else {
        org.hamcrest.MatcherAssert.assertThat(true, org.hamcrest.CoreMatchers.is(false));
    }
}