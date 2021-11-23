public com.github.codechapin.postcss.Root parse(final java.nio.file.Path path) {
    reset();
    loop(com.github.codechapin.postcss.internal.Utils.newBufferedReader(path));
    return root;
}