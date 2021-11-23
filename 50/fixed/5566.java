@org.jetbrains.annotations.Nullable
public static java.io.File getResource(@org.jetbrains.annotations.NotNull
java.lang.String path) {
    java.net.URL resource = mobi.hsz.idea.gitignore.util.Resources.class.getResource(path);
    if (resource == null) {
        return null;
    }
    return new java.io.File(resource.getPath());
}