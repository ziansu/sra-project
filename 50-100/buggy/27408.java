public void assertHasSameSizeAs(org.assertj.core.api.AssertionInfo info, java.lang.CharSequence actual, java.lang.Object other) {
    org.assertj.core.internal.Objects.instance().assertNotNull(info, actual);
    org.assertj.core.internal.Arrays.assertIsArray(info, other);
    org.assertj.core.internal.CommonValidations.hasSameSizeAsCheck(info, actual, other, actual.length());
}