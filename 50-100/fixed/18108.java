public boolean queriedObjectAtIndexHasSourceInstanceId(int index, long instanceId) {
    org.ccsds.moims.mo.com.archive.structures.ArchiveDetails archiveDetails = ((org.ccsds.moims.mo.com.archive.structures.ArchiveDetails) (queriedArchiveDetailsList.get(index)));
    return (archiveDetails.getDetails().getSource().getKey().getInstId()) == instanceId;
}