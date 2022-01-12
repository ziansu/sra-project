public org.kframework.krun.api.SearchResults search() throws org.kframework.krun.KRunExecutionException, org.kframework.utils.errorsystem.ParseFailedException {
    org.kframework.kil.ASTNode pattern = pattern(options.pattern);
    org.kframework.krun.tools.Executor.Tool.SearchPattern searchPattern = new org.kframework.krun.tools.Executor.Tool.SearchPattern(pattern);
    org.kframework.krun.api.SearchResults result;
    result = executor.search(options.bound, options.depth, options.searchType(), searchPattern.patternRule, initialConfiguration.get(), searchPattern.steps, false);
    sw.printIntermediate("Search total");
    return result;
}