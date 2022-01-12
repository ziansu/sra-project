public void setLiveMetadata(final org.apache.cassandra.config.CFMetaData liveMetadata) {
    if (liveMetadata == null)
        return ;
    
    this.liveMetadata = liveMetadata;
}