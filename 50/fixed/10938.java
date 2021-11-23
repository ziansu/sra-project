private static <T> void matchProperty(T component, T propertyValue) {
    org.hamcrest.MatcherAssert.assertThat(component, org.hamcrest.core.IsNull.notNullValue());
    org.hamcrest.MatcherAssert.assertThat(component, org.hamcrest.core.IsEqual.equalTo(propertyValue));
}