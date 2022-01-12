public com.google.cloud.genomics.dataflow.readers.bam.BAMShard finalize(htsjdk.samtools.BAMFileIndexImpl index, long lastLocus) {
    contig = new com.google.cloud.genomics.utils.Contig(contig.referenceName, contig.start, lastLocus);
    this.chunks = index.getChunksOverlapping(contig.referenceName, ((int) (contig.start)), ((int) (contig.end)));
    updateSpan();
    return this;
}