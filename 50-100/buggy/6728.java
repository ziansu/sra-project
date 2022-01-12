static java.util.List<org.jitsi.jicofo.ContentPacketExtension> createContents() {
    java.util.List<org.jitsi.jicofo.ContentPacketExtension> contents = new java.util.ArrayList<org.jitsi.jicofo.ContentPacketExtension>();
    contents.add(org.jitsi.jicofo.JingleOfferFactory.createContentForMedia(MediaType.AUDIO, false, true));
    contents.add(org.jitsi.jicofo.JingleOfferFactory.createContentForMedia(MediaType.VIDEO, false, true));
    contents.add(org.jitsi.jicofo.JingleOfferFactory.createContentForMedia(MediaType.DATA, false, true));
    return contents;
}