protected int getCompressionBlockSize() {
    int bufferSize = getConf().getInt(com.hadoop.compression.fourmc.FourMcCodec.FOURMC_BLOCK_SIZE_KEY, com.hadoop.compression.fourmc.FourMcCodec.FOURMC_MAX_BLOCK_SIZE);
    if ((bufferSize < (1024 * 100)) || (bufferSize > (com.hadoop.compression.fourmc.FourMcCodec.FOURMC_MAX_BLOCK_SIZE))) {
        bufferSize = com.hadoop.compression.fourmc.FourMcCodec.FOURMC_MAX_BLOCK_SIZE;
    }
    return bufferSize;
}