@org.junit.Test
public void givenVideoInputWithSubtitlesWhenScanningShouldReturnVideoWithSubtitles() throws java.lang.Exception {
    for (net.cserny.videosMover.model.Video video : videosScanned) {
        if (video.getInput().toString().contains(service.DOWNLOADS_MOVIE_WITH_SUBTITLE)) {
            java.util.List<java.nio.file.Path> subtitles = video.getSubtitles();
            assertNotNull(subtitles);
            assertFalse(subtitles.isEmpty());
        }
    }
}