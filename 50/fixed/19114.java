org.atlasapi.remotesite.bbc.nitro.GlycerinNitroContentAdapter nitroContentAdapter(com.metabroadcast.atlas.glycerin.Glycerin glycerin) {
    com.metabroadcast.common.time.SystemClock clock = new com.metabroadcast.common.time.SystemClock();
    org.atlasapi.remotesite.bbc.nitro.GlycerinNitroClipsAdapter clipsAdapter = new org.atlasapi.remotesite.bbc.nitro.GlycerinNitroClipsAdapter(glycerin, clock, nitroRequestPageSize);
    return new org.atlasapi.remotesite.bbc.nitro.GlycerinNitroContentAdapter(glycerin, clipsAdapter, peopleWriter, clock, nitroRequestPageSize);
}