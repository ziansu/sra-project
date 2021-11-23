public boolean retrievedObjectListContainsInstanceIdAndHasIntegerValue(long instanceId, int intValue) {
    int index = 0;
    for (org.ccsds.moims.mo.com.archive.structures.ArchiveDetails ad : retrievedArchiveDetailsList) {
        if ((ad.getInstId().longValue()) == instanceId) {
            org.ccsds.moims.mo.comprototype.archivetest.structures.TestObjectPayload object = ((org.ccsds.moims.mo.comprototype.archivetest.structures.TestObjectPayload) (retrievedObjectList.get(index)));
            return (object.getIntegerField().intValue()) == intValue;
        }
        index++;
    }
    return false;
}