public static htsjdk.samtools.SAMFileHeader createOutHeaderForReadGroup(final htsjdk.samtools.SAMReadGroupRecord samReadGroup, final htsjdk.samtools.SAMFileHeader inHeader, final htsjdk.samtools.SAMFileHeader.SortOrder sortOrder, final boolean removeAlignmentInformation) {
    final htsjdk.samtools.SAMFileHeader outHeader = new htsjdk.samtools.SAMFileHeader();
    outHeader.addReadGroup(samReadGroup);
    outHeader.setSortOrder(sortOrder);
    if (!removeAlignmentInformation) {
        outHeader.setSequenceDictionary(inHeader.getSequenceDictionary());
        outHeader.setProgramRecords(inHeader.getProgramRecords());
    }
    return outHeader;
}