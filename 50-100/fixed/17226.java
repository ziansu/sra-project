public static void updateMLMs(java.io.File[] files, java.lang.String outputDirectory) throws java.io.FileNotFoundException, java.io.IOException {
    for (java.io.File file : files) {
        if (!(file.getAbsolutePath().equals(outputDirectory))) {
            if (file.isDirectory()) {
                org.openmrs.module.chirdlutil.tools.ConvertRules.updateMLMs(file.listFiles(), outputDirectory);
            }else {
                org.openmrs.module.chirdlutil.tools.ConvertRules.processFile(file, outputDirectory);
            }
        }
    }
}