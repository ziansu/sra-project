public java.io.File getVolumeFile(long volumeNumber) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder(baseName);
    if ((format) != null) {
        builder.append(".part").append(java.lang.String.format(format, volumeNumber));
    }else {
        com.google.common.base.Preconditions.checkArgument((volumeNumber == 1));
    }
    java.lang.String name = builder.append(extension).toString();
    return (outputFolder) == null ? new java.io.File(name) : new java.io.File(outputFolder, name);
}