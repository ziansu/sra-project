private int lastNonGlobPath(java.lang.String path) {
    int last = 0;
    for (int i = 0; i != (path.length()); ++i) {
        if (com.thenewentity.utils.dropwizard.MultipleConfigurationProvider.globChars.contains(path.charAt(i))) {
            return last;
        }
        if ((path.charAt(i)) == (java.io.File.separatorChar)) {
            last = i;
        }
    }
    return -1;
}