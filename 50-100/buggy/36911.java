@java.lang.Override
public void initialize(org.apache.hadoop.fs.FSDataInputStream stream, com.datatorrent.lib.io.block.BlockMetadata blockMetadata, boolean consecutiveBlock) {
    super.initialize(stream, blockMetadata, consecutiveBlock);
    s3Params.initialzeFilepathAndFileLength(blockMetadata);
    try {
        int bytesRead = this.getBlockFromS3();
        if (bytesRead == (-1)) {
            return ;
        }
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    this.setBufferOffset(0);
}