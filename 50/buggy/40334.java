@javax.annotation.Nonnull
public static <R extends org.lenskit.api.Result> org.lenskit.api.ResultList<R> newResultList(@javax.annotation.Nonnull
java.util.List<? extends R> results) {
    return new org.lenskit.results.BasicResultList(results);
}