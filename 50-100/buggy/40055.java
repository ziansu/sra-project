@java.lang.Override
public int flush(java.lang.String path, net.fusejna.StructFuseFileInfo.FileInfoWrapper info) {
    java.nio.ByteBuffer buffer = this.writeBuffers.get(path);
    if (buffer) {
        buffer.rewind();
        super.write(path, buffer, buffer.array().length, 0, info);
    }else {
        java.lang.System.out.print(("File has been flushed that does not exist." + path));
    }
    return 0;
}