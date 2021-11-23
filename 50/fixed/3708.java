public com.github.codechapin.postcss.Root parse(final java.nio.file.Path path) {
    return parse(com.github.codechapin.postcss.internal.Utils.newBufferedReader(path));
}