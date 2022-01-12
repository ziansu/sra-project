boolean isWrongSequence(htsjdk.samtools.SAMRecord record) {
    return ((procesingUnmapped) && (!(record.getReadUnmappedFlag()))) || ((!(procesingUnmapped)) && ((record.getReadUnmappedFlag()) || ((((shard.contig.referenceName) != null) && (!(shard.contig.referenceName.isEmpty()))) && (!(shard.contig.referenceName.equals(record.getReferenceName()))))));
}