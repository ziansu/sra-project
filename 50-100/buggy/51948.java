void write(long offset, V val) throws java.lang.Exception {
    java.io.RandomAccessFile fileStore = new java.io.RandomAccessFile(file, "rw");
    fileStore.seek(offset);
    valueDT.write(val, fileStore);
    fileSize += valueDT.size();
    fileStore.seek(br.ufc.crateus.eda.btree.DataSerializer.FILE_SIZE_OFFSET);
    fileStore.writeLong(fileSize);
    fileStore.close();
}