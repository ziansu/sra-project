private static void assertStateCompleted(final org.apache.commons.math3.util.Pair<org.apache.drill.exec.proto.UserBitShared.QueryResult.QueryState, java.lang.Exception> result, final org.apache.drill.exec.proto.UserBitShared.QueryResult.QueryState expectedState) {
    final org.apache.drill.exec.proto.UserBitShared.QueryResult.QueryState actualState = result.getFirst();
    final java.lang.Exception exception = result.getSecond();
    if ((actualState != expectedState) || (exception != null)) {
        org.junit.Assert.fail(java.lang.String.format("Query state is incorrect (expected: %s, actual: %s) AND/OR \nException thrown: %s", expectedState, actualState, (exception == null ? "none." : exception)));
    }
}