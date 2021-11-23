public void clearErrors() {
    java.util.List<org.apache.oodt.cas.curation.ingest.InputStruct.InputEntry> torm = new java.util.LinkedList<org.apache.oodt.cas.curation.ingest.InputStruct.InputEntry>();
    for (org.apache.oodt.cas.curation.ingest.InputStruct.InputEntry entry : this.current) {
        if ((entry.error) != null)
            torm.add(entry);
        
    }
    for (org.apache.oodt.cas.curation.ingest.InputStruct.InputEntry entry : torm) {
        this.current.remove(entry);
    }
}