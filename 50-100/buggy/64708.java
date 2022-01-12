private static void runBugClerk(final java.util.Collection<java.lang.String> ids, org.jboss.jbossset.bugclerk.cli.BugClerkInvocatioWithFilterArguments arguments) throws java.net.MalformedURLException {
    if (arguments.isNoRun())
        return ;
    
    if (!(ids.isEmpty())) {
        org.jboss.jbossset.bugclerk.cli.BugClerkWithFilterCLI.endProgram(arguments, org.jboss.jbossset.bugclerk.cli.BugClerkWithFilterCLI.runBugClerk(ids, org.jboss.jbossset.bugclerk.utils.URLUtils.buildBzUrlPrefix(new java.net.URL(arguments.getFilterURL())), arguments.isCommentOnBZEnabled()));
    }else
        throw new java.lang.IllegalStateException(("Can't invoked filter" + " - got 'null' or no IDs instead of content."));
    
}