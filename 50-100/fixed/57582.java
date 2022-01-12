@org.junit.Test
public void handleNullValue() {
    de.ingrid.utils.IngridDocument result = plug.cswTransaction(null);
    org.junit.Assert.assertThat(result, org.hamcrest.CoreMatchers.is(org.hamcrest.CoreMatchers.not(org.hamcrest.CoreMatchers.nullValue())));
    org.junit.Assert.assertThat(result.getBoolean("success"), org.hamcrest.CoreMatchers.is(false));
}