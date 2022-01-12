boolean isBeyondTheInterval(final htsjdk.samtools.SAMRecord record) {
    if (record.getReadUnmappedFlag())
        return false;
    
    final boolean refMatch = (record.getReferenceIndex()) == (interval.referenceIndex);
    return (!refMatch) || (((interval.end) != (-1)) && ((record.getAlignmentStart()) > (interval.end)));
}