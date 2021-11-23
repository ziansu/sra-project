public void doScopeAnalysis(parser.TreeNode node, parser.InfoTable table) {
    java.lang.System.out.println("\nStarting scope analysis process: ");
    java.lang.System.out.println("--------------------------------------------------- ");
    try {
        recursiveScope(node, table, 0);
        postProcessing(table);
        java.lang.System.out.println("\nSuccessfully completed scope analysis process: ");
        java.lang.System.out.println("\t writing symbol table to file... ");
        toFile(table);
        java.lang.System.out.println("--------------------------------------------------- ");
    } catch (scope_crawler.ScopeAnalyser.StringException e) {
        java.lang.System.out.println(("Scope Analysis Error: " + (e.e)));
        java.lang.System.out.println("Exiting scope checker...\n");
    }
}