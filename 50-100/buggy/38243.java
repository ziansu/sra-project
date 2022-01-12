@java.lang.Override
public void close() throws java.io.IOException {
    flush();
    onClose();
    codec.writeBytes(BlockCompressedStreamConstants.EMPTY_GZIP_BLOCK);
    codec.close();
    if (((this.file) == null) || (!(this.file.isFile())))
        return ;
    
    if ((htsjdk.samtools.util.BlockCompressedInputStream.checkTermination(this.file)) != (BlockCompressedInputStream.FileTermination.HAS_TERMINATOR_BLOCK)) {
        throw new java.io.IOException(("Terminator block not found after closing BGZF file " + (this.file)));
    }
}