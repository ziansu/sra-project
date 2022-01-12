private static void loadFile(java.lang.String packageName, sbahjsic.runtime.ExecutionEnvironment env) throws java.lang.Exception {
    sbahjsic.io.StandardLibrary.LOADED.add(packageName);
    try (sbahjsic.io.FileSource fs = new sbahjsic.io.FileSource(new java.io.File(((((sbahjsic.io.StandardLibrary.STD) + "/") + packageName) + ".sb")))) {
        env.execute(fs);
    }
}