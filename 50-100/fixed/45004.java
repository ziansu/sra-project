boolean isBeyondTheInterval(final htsjdk.samtools.SAMRecord record) {
    if (record.getReadUnmappedFlag())
        return false;
    
    if ((record.getReferenceIndex()) > (interval.referenceIndex))
        return true;
    
    if ((record.getReferenceIndex()) != (interval.referenceIndex))
        return false;
    
    return ((interval.end) != (-1)) && ((record.getAlignmentStart()) > (interval.end));
}