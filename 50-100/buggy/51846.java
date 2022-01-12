public java.lang.String stripUnnecessaryComments(java.lang.String javaContent, org.eclipse.xtext.xtext.generator.parser.antlr.AntlrOptions options) {
    if (!(options.isOptimizeCodeQuality())) {
        return javaContent;
    }
    javaContent = stripMachineDependentPaths(javaContent);
    if (options.isStripAllComments()) {
        javaContent = stripAllComments(javaContent);
    }
    return javaContent;
}