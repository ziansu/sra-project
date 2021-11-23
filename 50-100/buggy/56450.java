public org.assertj.guava.api.RangeAssert<T> hasUpperEndpointEqualTo(final T value) throws java.lang.AssertionError {
    org.assertj.core.internal.Objects.instance().assertNotNull(info, actual);
    if (!(actual.upperEndpoint().equals(value))) {
        throw failures.failure(info, org.assertj.guava.error.RangeShouldHaveUpperEndpointEqual.shouldHaveEqualUpperEndpoint(actual, value, actual.lowerEndpoint()));
    }
    return this;
}