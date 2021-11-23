@java.lang.Override
java.util.stream.Stream<org.neo4j.server.security.enterprise.auth.TransactionTerminationResult> terminateTransactionsForValidUser(java.lang.String username) {
    if (failTerminateTransactions) {
        throw new java.lang.RuntimeException("Unexpected error");
    }
    return java.util.stream.Stream.empty();
}