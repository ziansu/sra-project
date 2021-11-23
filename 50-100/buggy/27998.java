private net.sourceforge.cobertura.dsl.Arguments buildReportingArguments(final java.io.File baseDirectory, final java.io.File destinationDirectory, final java.io.File baseDataFile) {
    getLog().debug("Building Cobertura report generation arguments");
    final net.sourceforge.cobertura.dsl.ArgumentsBuilder builder = new net.sourceforge.cobertura.dsl.ArgumentsBuilder();
    final net.sourceforge.cobertura.dsl.Arguments arguments = builder.setBaseDirectory(baseDirectory.getAbsolutePath()).setDestinationDirectory(destinationDirectory.getAbsolutePath()).setDataFile(baseDataFile.getAbsolutePath()).setEncoding(this.encoding).calculateMethodComplexity(this.calculateMethodComplexity).build();
    return arguments;
}