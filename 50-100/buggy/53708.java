private com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResChunkHeader getResChunkHeader() {
    com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResChunkHeader header = new com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResChunkHeader();
    header.setType(((short) (this.reader.readShort())));
    header.setHeaderSize(((short) (this.reader.readShort())));
    header.setSize(this.reader.readInt());
    return header;
}