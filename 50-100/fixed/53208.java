public org.ebml.Element write(org.ebml.io.DataWriter ioDW, org.ebml.matroska.MatroskaFileMetaSeek metaSeek) {
    long currentBytePositionInFile = ioDW.getFilePointer();
    org.ebml.matroska.MatroskaFileCues.LOG.debug("Writing matroska cues at file byte position [{}]", currentBytePositionInFile);
    long numberOfBytesInCueData = cues.writeElement(ioDW);
    org.ebml.matroska.MatroskaFileCues.LOG.debug("Done writing matroska cues, number of bytes was [{}]", numberOfBytesInCueData);
    metaSeek.addIndexedElement(cues, currentBytePositionInFile);
    return cues;
}