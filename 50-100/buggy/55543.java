@java.lang.Override
protected java.io.File persistentPath(build.pluto.buildjava.JavaBuilder.Input input) {
    if ((input.inputFiles.length) == 1) {
        return correspondingBinPath(org.sugarj.common.FileCommands.replaceExtension(input.inputFiles[0], "dep"), input);
    }
    int hash = java.util.Arrays.hashCode(input.inputFiles);
    return new java.io.File(input.targetDir, (("pluto.build.java-" + hash) + ".dep"));
}