@java.lang.SafeVarargs
@javax.annotation.Nonnull
public static <R extends org.lenskit.api.Result> org.lenskit.api.ResultList<R> newResultList(R... results) {
    return new org.lenskit.results.BasicResultList<R>(com.google.common.collect.ImmutableList.copyOf(results));
}