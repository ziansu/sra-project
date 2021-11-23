public java.lang.String stripUnnecessaryComments(java.lang.String javaContent, org.eclipse.xtext.xtext.generator.parser.antlr.AntlrOptions options) {
    if (!(options.isOptimizeCodeQuality())) {
        return javaContent;
    }
    if (options.isStripAllComments()) {
        javaContent = stripAllComments(javaContent);
    }else {
        javaContent = stripMachineDependentPaths(javaContent);
    }
    return javaContent;
}