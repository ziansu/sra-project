private java.lang.String[] createFlagNames(org.esa.beam.dataio.smos.dddb.FlagDescriptor[] flagDescriptors) {
    final java.lang.String[] flagNames = new java.lang.String[flagDescriptors.length];
    for (int i = 0; i < (flagDescriptors.length); i++) {
        flagNames[i] = flagDescriptors[i].getFlagName();
    }
    return flagNames;
}