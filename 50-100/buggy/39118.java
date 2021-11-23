private java.lang.String[] createFlagNames(org.esa.beam.dataio.smos.dddb.Family<org.esa.beam.dataio.smos.dddb.FlagDescriptor> flagDescriptors) {
    final java.util.List<org.esa.beam.dataio.smos.dddb.FlagDescriptor> flagDescriptorsList = flagDescriptors.asList();
    final java.util.List<java.lang.String> flagNames = new java.util.ArrayList(flagDescriptorsList.size());
    for (final org.esa.beam.dataio.smos.dddb.FlagDescriptor d : flagDescriptorsList) {
        flagNames.add(d.getFlagName());
    }
    return flagNames.toArray(new java.lang.String[flagNames.size()]);
}