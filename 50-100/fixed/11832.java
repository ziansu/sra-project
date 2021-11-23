public void run(@org.jetbrains.annotations.NotNull
com.intellij.openapi.progress.ProgressIndicator progressIndicator) {
    if (Utils.debug) {
        com.intellij.perlplugin.Utils.print("parsing started");
    }
    long start = java.lang.System.currentTimeMillis();
    com.intellij.perlplugin.PerlInternalParser.parseAllSources(progressIndicator);
    long end = java.lang.System.currentTimeMillis();
    if (Utils.debug) {
        com.intellij.perlplugin.Utils.print((("update completed in " + ((end - start) / 1000)) + "sec"));
    }
}