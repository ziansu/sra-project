public static void createNewBranch(java.lang.String user, java.lang.String message, java.lang.String graphName, java.lang.String revision, java.lang.String branchName) throws de.tud.plt.r43ples.exception.InternalErrorException {
    java.lang.String query = java.lang.String.format(("" + (("USER \"%s\" %n" + "MESSAGE \"%s\" %n") + "BRANCH GRAPH <%s> REVISION \"%s\" TO \"%s\"")), user, message, graphName, revision, branchName);
    de.tud.plt.r43ples.management.DatasetGenerationManagement.ep.sparql(MediaType.TEXT_HTML, query);
    de.tud.plt.r43ples.management.DatasetGenerationManagement.logger.info((((("New branch \"" + branchName) + "\" for <") + graphName) + "> created."));
}