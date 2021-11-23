@java.lang.Override
protected java.io.File persistentPath(build.pluto.buildjava.JavaBuilder.Input input) {
    if ((input.inputFiles.size()) == 1) {
        return correspondingBinPath(org.sugarj.common.FileCommands.replaceExtension(input.inputFiles.get(0), "dep"), input);
    }
    int hash = input.inputFiles.hashCode();
    return new java.io.File(input.targetDir, (("pluto.build.java-" + hash) + ".dep"));
}