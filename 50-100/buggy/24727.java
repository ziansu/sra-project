private void parseResTableHeader() {
    com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResTableHeader header = new com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResTableHeader();
    header.setHeader(getResChunkHeader());
    header.setPackageCount(this.reader.readInt());
    this.table.setHeader(header);
    this.table.setStringPool(parseResStringPool());
}