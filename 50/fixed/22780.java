public static boolean match(java.util.List<java.lang.String> patterns, java.io.File file) {
    return !(com.github.dockerjava.core.GoLangFileMatch.match(patterns, file.getPath()).isEmpty());
}