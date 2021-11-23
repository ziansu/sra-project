void enqueue(org.sleuthkit.datamodel.FsContent fsContent, java.util.Collection<org.sleuthkit.autopsy.ingest.IngestServiceFsContent> services) {
    org.sleuthkit.autopsy.ingest.IngestManager.QueueUnit<org.sleuthkit.datamodel.FsContent, org.sleuthkit.autopsy.ingest.IngestServiceFsContent> found = findFsContent(fsContent);
    if (found != null) {
        found.addAll(services);
    }else {
        found = new org.sleuthkit.autopsy.ingest.IngestManager.QueueUnit<org.sleuthkit.datamodel.FsContent, org.sleuthkit.autopsy.ingest.IngestServiceFsContent>(fsContent, services);
        fsContentUnits.add(found);
    }
}