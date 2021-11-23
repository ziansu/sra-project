private static void assertTypeAndValue(net.helpscout.api.CustomFieldResponse<?> customFieldResponse, java.lang.Class<? extends net.helpscout.api.CustomFieldResponse<?>> fieldClass, java.lang.Object fieldValue) {
    org.hamcrest.MatcherAssert.assertThat(customFieldResponse, org.hamcrest.Matchers.instanceOf(fieldClass));
    lombok.val value = customFieldResponse.getValue();
    org.hamcrest.MatcherAssert.assertThat(value, org.hamcrest.Matchers.equalTo(fieldValue));
}