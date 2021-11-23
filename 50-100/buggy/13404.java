void processRecord(htsjdk.samtools.SAMRecord record) {
    if (isWrongSequence(record)) {
        (mismatchedSequence)++;
        return ;
    }
    if ((record.getAlignmentStart()) < (shard.contig.start)) {
        (recordsBeforeStart)++;
        return ;
    }
    if ((record.getAlignmentStart()) > (shard.contig.end)) {
        (recordsAfterEnd)++;
        return ;
    }
    c.output(com.google.cloud.genomics.dataflow.readers.bam.ReadConverter.makeRead(record));
    (recordsProcessed)++;
}