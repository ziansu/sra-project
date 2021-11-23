private void parseResTableHeader() {
    com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResTableHeader header = new com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResTableHeader();
    header.setHeader(getResChunkHeader());
    header.setPackageCount(reader.readInt());
    table.setHeader(header);
    table.setStringPool(parseResStringPool());
}