boolean isWrongSequence(htsjdk.samtools.SAMRecord record) {
    return ((procesingUnmapped) && (!(record.getReadUnmappedFlag()))) || ((((!(procesingUnmapped)) && ((shard.contig.referenceName) != null)) && (!(shard.contig.referenceName.isEmpty()))) && (!(shard.contig.referenceName.equals(record.getReferenceName()))));
}