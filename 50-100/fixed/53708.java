private com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResChunkHeader getResChunkHeader() {
    com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResChunkHeader header = new com.chris.pkg.manager.bean.android.resource.bean.chunk.header.ResChunkHeader();
    header.setType(((short) (reader.readShort())));
    header.setHeaderSize(((short) (reader.readShort())));
    header.setSize(reader.readInt());
    return header;
}