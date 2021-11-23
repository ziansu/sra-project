@org.junit.Test
public void should_return_null_or_empty_if_no_url() throws java.io.IOException {
    java.lang.String url = "";
    lan.dk.podcastserver.entity.Cover coverFromURL = imageService.getCoverFromURL(url);
    lan.dk.podcastserver.entity.CoverAssert.assertThat(coverFromURL).isEqualTo(Cover.DEFAULT_COVER);
}