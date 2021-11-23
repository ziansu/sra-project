@javax.annotation.Nonnull
@java.lang.Override
public java.io.InputStream getInput(@javax.annotation.Nonnull
org.apache.hadoop.conf.Configuration conf) throws java.io.IOException {
    com.netflix.aegisthus.io.sstable.compression.CompressionMetadata compressionMetadata = com.netflix.aegisthus.input.splits.AegCompressedSplit.getCompressionMetadata(conf, compressionMetadataPath, compressedLength);
    return new com.netflix.aegisthus.io.sstable.compression.CompressionInputStream(super.getInput(conf), compressionMetadata);
}