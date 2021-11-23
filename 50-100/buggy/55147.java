protected void handleException(org.neo4j.shell.Output out, org.neo4j.kernel.impl.query.QueryExecutionKernelException exception, long startTime) throws java.rmi.RemoteException {
    out.println((((now()) - startTime) + " ms"));
    out.println();
    out.println(("WARNING: " + (exception.getMessage())));
}