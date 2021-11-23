public long getFilePointer() {
    return htsjdk.samtools.util.BlockCompressedFilePointerUtil.makeFilePointer(mBlockAddress, numUncompressedBytes);
}