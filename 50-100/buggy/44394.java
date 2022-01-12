public java.io.File getVolumeFile(long volumeNumber) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder(baseName);
    if ((format) != null) {
        builder.append(".part").append(java.lang.String.format(format, volumeNumber));
    }else {
        com.google.common.base.Preconditions.checkArgument((volumeNumber == 1));
    }
    return new java.io.File(outputFolder, builder.append(extension).toString());
}