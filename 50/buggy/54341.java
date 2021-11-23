public void setLiveMetadata(final org.apache.cassandra.config.CFMetaData liveMetadata) {
    if (liveMetadata == null)
        return ;
    
    assert ((this.liveMetadata) == null) || ((this.liveMetadata) == liveMetadata);
    this.liveMetadata = liveMetadata;
}