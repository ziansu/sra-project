private long getFileSize() throws java.io.IOException {
    if (file.exists()) {
        java.io.RandomAccessFile fileStore = new java.io.RandomAccessFile(file, "r");
        fileStore.seek(br.ufc.crateus.eda.btree.DataSerializer.FILE_SIZE_OFFSET);
        long fileSize = fileStore.readLong();
        fileStore.close();
        return fileSize;
    }else {
        java.io.RandomAccessFile fileStore = new java.io.RandomAccessFile(file, "rw");
        fileStore.seek(br.ufc.crateus.eda.btree.DataSerializer.FILE_SIZE_OFFSET);
        fileStore.writeLong(8L);
        fileStore.close();
        return 0L;
    }
}