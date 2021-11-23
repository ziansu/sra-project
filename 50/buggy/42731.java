public void load(java.lang.String filename) throws java.io.IOException {
    this.metaFilename = filename;
    variantMetadata = mapper.readValue(filename, org.opencb.biodata.models.variant.metadata.VariantMetadata.class);
}