@org.junit.Test
public void should_throw_exception_if_url_not_valid() {
    lan.dk.podcastserver.entity.CoverAssert.assertThat(imageService.getCoverFromURL("blabla")).isEqualTo(null);
}