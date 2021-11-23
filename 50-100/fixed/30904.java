@org.junit.Test
public void should_reject_input_stream() throws java.io.IOException {
    org.mockito.Mockito.doThrow(new java.lang.RuntimeException()).when(urlService).asStream(((lan.dk.podcastserver.service.ImageServiceTest.HTTP_LOCALHOST) + "/img/image.png"));
    lan.dk.podcastserver.entity.Cover cover = imageService.getCoverFromURL(((lan.dk.podcastserver.service.ImageServiceTest.HTTP_LOCALHOST) + "/img/image.png"));
    lan.dk.podcastserver.entity.CoverAssert.assertThat(cover).isEqualTo(null);
}