public java.io.InputStream getResourceAsStream(java.lang.String name) throws java.io.IOException {
    if (name == null) {
        throw new java.lang.NullPointerException("name");
    }
    cn.rui.chm.CHMFile.ListingEntry entry = resolveEntry(name);
    if (entry == null)
        throw new java.io.FileNotFoundException((((file) + "#") + name));
    
    cn.rui.chm.CHMFile.Section section = sections[entry.section];
    return section.resolveInputStream(entry.offset, entry.length);
}