private java.lang.String extractTagUri(org.atlasapi.media.entity.Identified identified) {
    com.google.common.base.Optional<java.lang.String> contentLink = contentLinkFrom(identified);
    if (contentLink.isPresent()) {
        return contentLink.get().replace(org.atlasapi.feeds.interlinking.C4PlaylistToInterlinkFeedAdapter.WWW_CHANNEL4_PROGRAMMES_PREFIX, org.atlasapi.feeds.interlinking.C4PlaylistToInterlinkFeedAdapter.C4_TAG_PREFIX);
    }
    return identified.getCanonicalUri().replace(org.atlasapi.feeds.interlinking.C4PlaylistToInterlinkFeedAdapter.CANONICAL_URI_PREFIX, org.atlasapi.feeds.interlinking.C4PlaylistToInterlinkFeedAdapter.C4_TAG_PREFIX);
}