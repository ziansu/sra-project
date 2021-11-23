void buildXmlScore() {
    java.util.List<com.xenoage.zong.musicxml.types.partwise.MxlPart> parts = new java.util.ArrayList<com.xenoage.zong.musicxml.types.partwise.MxlPart>();
    parts.add(buildPart());
    java.lang.String version = "1.0";
    xmlDoc = new com.xenoage.zong.musicxml.MusicXMLDocument(new io_handler.MxlScorePartwise(buildMeta(), parts, version));
}