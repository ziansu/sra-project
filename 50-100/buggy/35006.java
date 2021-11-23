private void processNextPage() throws java.io.IOException {
    int bitOffset = (sasFileProperties.isU64()) ? PAGE_BIT_OFFSET_X64 : PAGE_BIT_OFFSET_X86;
    currentPageDataSubheaderPointers.clear();
    try {
        sasFileStream.readFully(cachedPage, 0, sasFileProperties.getPageLength());
    } catch (java.io.EOFException e) {
        return ;
    }
    readPageHeader();
    if ((currentPageType) == (PAGE_META_TYPE)) {
        java.util.List<com.ggasoftware.parso.SasFileParser.SubheaderPointer> subheaderPointers = new java.util.ArrayList<com.ggasoftware.parso.SasFileParser.SubheaderPointer>();
        processPageMetadata(bitOffset, subheaderPointers);
    }
}