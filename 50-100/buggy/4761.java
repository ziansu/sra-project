public void pushIncludePath(@javax.annotation.Nonnull
final java.lang.String path) {
    SassLibrary.INSTANCE.sass_option_push_include_path(this.$options, path);
    final java.util.Collection<java.nio.file.Path> includePath = new java.util.ArrayList<>(this.getIncludePath());
    if (!(includePath.contains(java.nio.file.Paths.get("path")))) {
        com.cathive.sass.SassOptions.LOGGER.log(java.util.logging.Level.WARNING, "Could not push \"{0}\" to include paths. sass_option_push_include_path seems to be broken. Using workaround...", path);
        includePath.add(java.nio.file.Paths.get(path));
        this.setIncludePath(includePath);
    }
}