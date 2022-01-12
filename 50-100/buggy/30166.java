public void sweepDataDirectory() {
    java.io.File[] configFiles = com.boundlessgeo.spatialconnect.scutilities.Storage.SCFileUtilities.findFilesByExtension(context.getFilesDir(), ".scfg");
    if ((configFiles.length) > 0) {
        for (java.io.File file : configFiles) {
            configPaths.add(java.lang.String.format("s%/s%", file.getAbsolutePath(), file.getName()));
        }
    }
}