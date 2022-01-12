private org.opencb.cellbase.app.cli.CellBaseParser buildCosmic() {
    java.nio.file.Path cosmicFilePath = input.resolve("CosmicMutantExport.tsv");
    org.opencb.cellbase.core.serializer.CellBaseSerializer serializer = new org.opencb.cellbase.core.serializer.CellBaseJsonFileSerializer(output, "cosmic");
    return new org.opencb.cellbase.app.cli.CosmicParser(cosmicFilePath, serializer);
}