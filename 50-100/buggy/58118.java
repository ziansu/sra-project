public static final java.util.List<ch.njol.skript.config.Config> loadStructures(final java.io.File[] files) {
    java.util.Arrays.sort(files);
    java.util.List<ch.njol.skript.config.Config> loadedFiles = new java.util.ArrayList<>(files.length);
    for (final java.io.File f : files) {
        assert f != null : java.util.Arrays.toString(files);
        loadedFiles.add(ch.njol.skript.ScriptLoader.loadStructure(f));
    }
    ch.njol.skript.SkriptEventHandler.registerBukkitEvents();
    return loadedFiles;
}