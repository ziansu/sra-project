public static <T> it.ozimov.cirneco.hamcrest.java7.AssertFluently.AssertionBuilder<T> given(@javax.annotation.Nonnull
final T actual) {
    com.google.common.base.Preconditions.checkNotNull(actual);
    return new it.ozimov.cirneco.hamcrest.java7.AssertFluently.AssertionBuilder<T>(actual);
}