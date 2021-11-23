@java.lang.Override
public void initialize(org.apache.hadoop.fs.FSDataInputStream stream, com.datatorrent.lib.io.block.BlockMetadata blockMetadata, boolean consecutiveBlock) {
    super.initialize(stream, blockMetadata, consecutiveBlock);
    s3Params.initialzeFilepathAndFileLength(blockMetadata);
    int bufferSize = java.lang.Long.valueOf(((blockMetadata.getLength()) - (blockMetadata.getOffset()))).intValue();
    this.setBufferSize(bufferSize);
    if ((overflowBufferSize) > bufferSize) {
        this.setOverflowBufferSize(bufferSize);
    }else {
        this.setOverflowBufferSize(overflowBufferSize);
    }
}