private org.opencb.cellbase.app.cli.CellBaseParser buildVariation() {
    java.nio.file.Path variationFolderPath = input.resolve("variation");
    org.opencb.cellbase.core.serializer.CellBaseFileSerializer serializer = new org.opencb.cellbase.core.serializer.CellBaseJsonFileSerializer(output);
    return new org.opencb.cellbase.app.transform.variation.VariationParser(variationFolderPath, serializer);
}