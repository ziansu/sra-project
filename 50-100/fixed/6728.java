static java.util.List<org.jitsi.jicofo.ContentPacketExtension> createContents() {
    java.util.List<org.jitsi.jicofo.ContentPacketExtension> contents = new java.util.ArrayList<org.jitsi.jicofo.ContentPacketExtension>();
    contents.add(org.jitsi.jicofo.JingleOfferFactory.createContentForMedia(MediaType.AUDIO, false, true, false));
    contents.add(org.jitsi.jicofo.JingleOfferFactory.createContentForMedia(MediaType.VIDEO, false, true, false));
    contents.add(org.jitsi.jicofo.JingleOfferFactory.createContentForMedia(MediaType.DATA, false, true, false));
    return contents;
}