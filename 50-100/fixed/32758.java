@java.lang.Override
public void setId(java.lang.String id) throws java.io.IOException, loci.formats.FormatException {
    super.setId(id);
    lutLength = getLookupTableComponentCount();
    if (!(id.equals(getCurrentFile()))) {
        loci.formats.meta.MetadataStore store = getMetadataStore();
        loci.formats.MetadataTools.populatePixels(store, this, false, false);
    }
}