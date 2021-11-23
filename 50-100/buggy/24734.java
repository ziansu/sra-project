@org.junit.Test
public void testParentRefsForExtractedTopLevelItemAreEmpty() {
    com.metabroadcast.atlas.glycerin.model.Episode tli = new com.metabroadcast.atlas.glycerin.model.Episode();
    tli.setPid("p01mv8m3");
    tli.setTitle("Pantocracy");
    org.atlasapi.media.entity.Item extracted = extractor.extract(org.atlasapi.remotesite.bbc.nitro.extract.NitroItemSource.valueOf(tli, org.atlasapi.remotesite.bbc.nitro.extract.NitroEpisodeExtractorTest.noAvailability));
    org.junit.Assert.assertFalse((extracted instanceof com.metabroadcast.atlas.glycerin.model.Episode));
    org.junit.Assert.assertNull(extracted.getContainer());
    org.junit.Assert.assertThat(extracted.getTitle(), org.hamcrest.Matchers.is(tli.getTitle()));
}