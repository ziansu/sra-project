@javax.annotation.Nonnull
public static org.lenskit.api.ResultList newResultList(@javax.annotation.Nonnull
java.util.List<? extends org.lenskit.api.Result> results) {
    return new org.lenskit.results.BasicResultList(results);
}