@org.junit.Test
public void testFilmInstanceIsCreatedForFilmsFormat() {
    com.metabroadcast.atlas.glycerin.model.Episode tli = new com.metabroadcast.atlas.glycerin.model.Episode();
    tli.setPid("b012cl84");
    tli.setTitle("Destiny");
    tli.setProgrammeFormats(filmFormatsType());
    org.atlasapi.media.entity.Item extracted = extractor.extract(org.atlasapi.remotesite.bbc.nitro.extract.NitroItemSource.valueOf(tli, org.atlasapi.remotesite.bbc.nitro.extract.NitroEpisodeExtractorTest.noAvailability));
    org.junit.Assert.assertThat(extracted, org.hamcrest.Matchers.is(org.hamcrest.Matchers.instanceOf(org.atlasapi.media.entity.Film.class)));
}