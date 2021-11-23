private net.sourceforge.subsonic.controller.CoverArtController.CoverArtRequest createPodcastCoverArtRequest(int id, javax.servlet.http.HttpServletRequest request) {
    net.sourceforge.subsonic.domain.PodcastChannel channel = podcastService.getChannel(id);
    if (channel == null) {
        return null;
    }
    if ((channel.getMediaFileId()) == null) {
        return new net.sourceforge.subsonic.controller.CoverArtController.PodcastCoverArtRequest(channel);
    }
    return createMediaFileCoverArtRequest(channel.getMediaFileId(), request);
}