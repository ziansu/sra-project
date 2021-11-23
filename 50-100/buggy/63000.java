void compress(java.nio.ByteBuffer inputBuffer, int startPosition, int length, java.nio.ByteBuffer compressedBuffer, org.apache.cassandra.io.compress.ICompressor compressor) throws java.io.IOException {
    java.nio.ByteBuffer inputBufferSlice = inputBuffer.duplicate();
    inputBufferSlice.limit((startPosition + length)).position(startPosition);
    final int compressedOutputSize = compressor.initialCompressedBufferLength(length);
    compressedBuffer = adjustWorkingBufferSize(compressedBuffer, compressedOutputSize, org.apache.cassandra.db.commitlog.EncryptedSegment.compressedBufferHolder);
    compressor.compress(inputBufferSlice, compressedBuffer);
}