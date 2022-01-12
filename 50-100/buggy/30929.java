public java.io.File getJarToTest(java.lang.String newName) {
    java.lang.String fileName = newName;
    java.io.File jarFileTemplate = new java.io.File("resources/com.byc.test.plugin_1.0.0.20160728_1736_patch.jar");
    if (fileName == null) {
        fileName = jarFileTemplate.getName();
    }
    java.io.File tmpFolder = new java.io.File(java.lang.System.getProperty("java.io.tmpdir"));
    java.io.File testJar = new java.io.File(tmpFolder, fileName);
    try {
        org.apache.commons.io.FileUtils.copyFile(jarFileTemplate, testJar);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return testJar;
}