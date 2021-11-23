public static java.io.Serializable readObj(java.lang.String name) {
    java.lang.Object obj = zilla.libcore.file.PersistenceManager.cache.get(name).get();
    if (obj == null) {
        obj = zilla.libcore.file.FileHelper.readObj((((FileHelper.PATH_FILES) + name) + ".obj"));
        if (obj == null) {
            return null;
        }
    }
    return ((java.io.Serializable) (obj));
}