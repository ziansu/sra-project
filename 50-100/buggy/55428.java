public void start() throws java.io.IOException {
    java.lang.System.out.println((("Start creating project \"" + (projectName)) + "\""));
    com.android.utils.FileUtils.cleanOutputDir(new java.io.File(projectDirectory));
    java.lang.System.out.println(("Copy project files into directory: " + (projectDirectory)));
    if (unpackProject()) {
        prepareFiles();
        if (!(pluginMode)) {
            createScreen();
        }
    }else {
        java.lang.System.out.println("Fail to unpack project");
    }
}