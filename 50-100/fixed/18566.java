static java.lang.String[] tokenizeArgs(java.lang.String args) {
    if (args == null) {
        return null;
    }
    final java.lang.String[] tokenize = hudson.plugins.msbuild.Util.tokenize(args);
    if (args.endsWith("\\")) {
        tokenize[((tokenize.length) - 1)] = (tokenize[((tokenize.length) - 1)]) + "\\";
    }
    return tokenize;
}