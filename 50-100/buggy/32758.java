@java.lang.Override
public void setId(java.lang.String id) throws java.io.IOException, loci.formats.FormatException {
    if (!(id.equals(getCurrentFile()))) {
        super.setId(id);
        lutLength = getLookupTableComponentCount();
        loci.formats.meta.MetadataStore store = getMetadataStore();
        loci.formats.MetadataTools.populatePixels(store, this, false, false);
    }
}