public boolean queriedObjectAtIndexHasRelated(int index, long related) {
    org.ccsds.moims.mo.com.archive.structures.ArchiveDetails archiveDetails = ((org.ccsds.moims.mo.com.archive.structures.ArchiveDetails) (queriedArchiveDetailsList.get(index)));
    return (archiveDetails.getDetails().getRelated()) == related;
}